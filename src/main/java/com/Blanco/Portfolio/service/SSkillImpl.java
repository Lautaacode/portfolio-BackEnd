package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Skill;
import com.Blanco.Portfolio.repository.RSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SSkillImpl implements SSkill{

    @Autowired
    private RSkill rSkill;
    @Override
    public Skill createSkill(Skill skill) {
        return rSkill.save(skill);
    }

    @Override
    public List<Skill> getSkills() {
        return (List<Skill>) rSkill.findAll();
    }

    @Override
    public Skill getSkill(long id) {
        return rSkill.findById(id).get();
    }

    @Override
    public void deleteSkill(long id) {
        rSkill.deleteById(id);
    }

    @Override
    public Skill updateSkill(Skill skill, long id) {
        Skill skill1 = rSkill.findById(id).get();
        skill1.setSkillIco(skill.getSkillIco());
        skill1.setPercent(skill.getPercent());
        return rSkill.save(skill1);
    }
}
