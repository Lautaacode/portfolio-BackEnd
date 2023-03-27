package com.Blanco.Portfolio.repository;

import com.Blanco.Portfolio.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPerson extends CrudRepository<Person,Long> {
}