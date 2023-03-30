package com.Blanco.Portfolio.security.service;

import com.Blanco.Portfolio.security.entity.Admin;
import com.Blanco.Portfolio.security.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SDetails implements UserDetailsService{
    
    @Autowired
    SUser sUser;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = sUser.getByUserName(userName).get();
        
        return Admin.build(user);
        
    }
    
}
