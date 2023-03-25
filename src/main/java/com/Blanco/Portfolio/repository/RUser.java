package com.Blanco.Portfolio.repository;

import com.Blanco.Portfolio.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUser extends CrudRepository<User,Long> {
}