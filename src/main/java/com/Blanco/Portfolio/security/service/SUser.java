package com.Blanco.Portfolio.security.service;

import com.Blanco.Portfolio.security.entity.User;
import com.Blanco.Portfolio.security.repository.RUser;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SUser {
    @Autowired
    RUser rUser;
    
    public Optional<User> getByUserName(String userName){
        return rUser.findByUserName(userName);
    }
    
    public boolean existsByUserName(String userName){
        return rUser.existsByUserName(userName);
    }
    
    public boolean existsByEmail(String email){
        return rUser.existsByEmail(email);
    }
    
    public void save (User user){
        rUser.save(user);
    }
    
}
