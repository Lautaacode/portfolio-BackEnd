package com.Blanco.Portfolio.repository;

import com.Blanco.Portfolio.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RProject extends CrudRepository<Project,Long> {
}
