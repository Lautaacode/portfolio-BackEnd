package com.Blanco.Portfolio.controller;

import com.Blanco.Portfolio.entity.User;
import com.Blanco.Portfolio.service.SUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@CrossOrigin("*")
public class CUser {
    @Autowired SUser sUser;

    @GetMapping("/show")
    @ResponseBody
    public List<User> showUsers(){
        return  sUser.showUsers();
    }
    @GetMapping("/show/{id}")
    @ResponseBody
    public User showUser(@PathVariable int id){
        return sUser.showUser(id);
    }
    @PostMapping("/new")
    public String newUser(@RequestBody User user){
        sUser.newUser(user);
        return"El usuario se creo correctamente.";
    }
    @PutMapping("/update")
    public String updateUser(@RequestBody User user){
        sUser.updateUser(user);
        return "El usuario se edito correctamente.";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        sUser.deleteUser(id);
        return "El usuario se elimino correctamente.";
    }

}
