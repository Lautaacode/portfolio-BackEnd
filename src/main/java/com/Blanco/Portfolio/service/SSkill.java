package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Education;

import com.Blanco.Portfolio.entity.Skill;
import com.Blanco.Portfolio.repository.RSkill;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class SSkill {
    @Autowired
    public RSkill rSkill;
    public List<Skill> showSkills(){
        List<Skill> listSkill = rSkill.findAll();
        return listSkill;
    }
    public void newSkill(Skill skill){
        rSkill.save(skill);
    }
    public void updateSkill(Skill skill){
        rSkill.save(skill);
    }
    public void deleteSkill(int id){
        rSkill.deleteById(id);
    }
    public Skill showSkill(int id){
        Skill skill = rSkill.findById(id).orElse(null);
        return skill;
    }
}
