package com.Blanco.Portfolio.security.service;

import com.Blanco.Portfolio.security.entity.Role;

import com.Blanco.Portfolio.security.enums.RoleName;
import com.Blanco.Portfolio.security.repository.RRole;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SRole {
    @Autowired
    RRole rRole;
    
    public Optional<Role> getByRoleName(RoleName roleName){
    
        return rRole.findByRoleName(roleName);
    }
    
    public void save(Role role){
        rRole.save(role);
    }
    
}
