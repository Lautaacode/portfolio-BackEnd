package com.Blanco.Portfolio.repository;

import com.Blanco.Portfolio.entity.Experience;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperience extends CrudRepository<Experience, Long> {
}
