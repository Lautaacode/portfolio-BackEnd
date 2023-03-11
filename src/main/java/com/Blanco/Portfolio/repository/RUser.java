package com.Blanco.Portfolio.repository;

import com.Blanco.Portfolio.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUser extends JpaRepository <User,Integer> {

}
