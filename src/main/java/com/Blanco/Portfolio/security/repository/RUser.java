package com.Blanco.Portfolio.security.repository;

import com.Blanco.Portfolio.security.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUser extends JpaRepository<User, Integer> {

    Optional<User> findByUserName(String userName);

    boolean existsByUserName(String userName);

    boolean existsByEmail(String email);

}
