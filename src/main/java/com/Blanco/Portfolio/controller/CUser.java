package com.Blanco.Portfolio.controller;

import com.Blanco.Portfolio.entity.User;
import com.Blanco.Portfolio.service.SUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@CrossOrigin(origins = "*")
public class CUser {
    @Autowired
    private SUser sUser;

    @PostMapping("/add")
    public User createUser(@RequestBody User user){
        User user1 = sUser.createUser(user);
        return user1;
    }
    @GetMapping("/show")
    public List<User> getUsers(){
        return sUser.getUsers();
    }

    @PutMapping("/update/{id}")
    public User updateUser(@RequestBody User user, @PathVariable("id") long id){
        return sUser.updateUser(user,id);
    }

    @DeleteMapping("/delete/{id}")
    public  String deleteUser(@PathVariable("id") long id){
        sUser.deleteUser(id);
        return "El usuario se elimino correctamente";
    }
    @GetMapping("/show/{id}")
    public  User getUser(@PathVariable("id") long id){
        return sUser.getUser(id);
    }
}