package com.Blanco.Portfolio.repository;

import com.Blanco.Portfolio.entity.Skill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkill extends CrudRepository<Skill, Long> {
}
