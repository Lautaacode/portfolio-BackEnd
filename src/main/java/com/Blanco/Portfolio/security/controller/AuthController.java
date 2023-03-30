package com.Blanco.Portfolio.security.controller;

import com.Blanco.Portfolio.security.controller.Message;
import com.Blanco.Portfolio.security.dto.DJwt;
import com.Blanco.Portfolio.security.dto.LoginUser;
import com.Blanco.Portfolio.security.dto.NewUser;
import com.Blanco.Portfolio.security.entity.Role;
import com.Blanco.Portfolio.security.entity.User;
import com.Blanco.Portfolio.security.enums.RoleName;
import com.Blanco.Portfolio.security.jwt.JwtProvider;
import com.Blanco.Portfolio.security.service.SRole;
import com.Blanco.Portfolio.security.service.SUser;
import jakarta.validation.Valid;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    SUser sUser;
    @Autowired
    SRole sRole;
    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/new")
    public ResponseEntity<?> nuevo(@Valid @RequestBody NewUser newUser, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity(new Message("Campos mal puestos o email invalido"), HttpStatus.BAD_REQUEST);
        }

        if (sUser.existsByUserName(newUser.getUserName())) {
            return new ResponseEntity(new Message("Ese nombre de usurio ya existe"), HttpStatus.BAD_REQUEST);
        }

        if (sUser.existsByEmail(newUser.getEmail())) {
            return new ResponseEntity(new Message("Ese email ya existe"), HttpStatus.BAD_REQUEST);
        }

        User user = new User(newUser.getName(), newUser.getUserName(), newUser.getEmail(), passwordEncoder.encode(newUser.getPassword()));

        Set<Role> roles = new HashSet<>();
        roles.add(sRole.getByRoleName(RoleName.ROLE_USER).get());

        if (newUser.getRoles().contains("admin")) {
            roles.add(sRole.getByRoleName(RoleName.ROLE_USER).get());
        }
        user.setRoles(roles);
        sUser.save(user);

        return new ResponseEntity(new Message("Usuario guardado"), HttpStatus.CREATED);

    }

    @PostMapping("/login")
    public ResponseEntity<DJwt> login(@Valid @RequestBody LoginUser loginUser, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity(new Message("Campos mal puestos"), HttpStatus.BAD_REQUEST);
        }

        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getUserName(), loginUser.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtProvider.generateToken(authentication);

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        DJwt dJwt = new DJwt(jwt, userDetails.getUsername(), userDetails.getAuthorities());

        return new ResponseEntity(dJwt, HttpStatus.OK);
    }

}
