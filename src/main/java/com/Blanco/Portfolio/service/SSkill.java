package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Skill;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SSkill {
    public Skill createSkill(Skill skill);

    public List<Skill> getSkills();

    public Skill getSkill(long id);

    public void deleteSkill(long id);

    public Skill updateSkill(Skill skill, long id);
}
