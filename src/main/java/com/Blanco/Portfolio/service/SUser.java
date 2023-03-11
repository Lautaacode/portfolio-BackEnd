package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.User;
import com.Blanco.Portfolio.repository.RUser;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SUser {

    @Autowired
    public RUser rUser;
    public List<User> showUsers(){
        List<User> listUser = rUser.findAll();
        return listUser;
    }
    public void newUser(User user){
        rUser.save(user);
    }
    public void updateUser(User user){
        rUser.save(user);
    }
    public void deleteUser(int id){
        rUser.deleteById(id);
    }
    public User showUser(int id){
        User user = rUser.findById(id).orElse(null);
        return user;
    }

}
