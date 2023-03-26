package com.Blanco.Portfolio.repository;

import com.Blanco.Portfolio.entity.Education;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducation extends CrudRepository<Education,Long> {
}
