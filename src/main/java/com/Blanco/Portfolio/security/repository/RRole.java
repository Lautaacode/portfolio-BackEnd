package com.Blanco.Portfolio.security.repository;

import com.Blanco.Portfolio.security.entity.Role;
import com.Blanco.Portfolio.security.enums.RoleName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRole extends JpaRepository<Role, Integer> {

    Optional<Role> findByRoleName(RoleName roleName);
}
