package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Experience;
import com.Blanco.Portfolio.repository.RExperience;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SExperience {

    @Autowired
    public RExperience rExperience;
    public List<Experience> showExperiences(){
        List<Experience> listExperiences = rExperience.findAll();
        return listExperiences;
    }
    public void newExperience(Experience experience){
        rExperience.save(experience);
    }
    public void updateExperience(Experience experience){
        rExperience.save(experience);
    }
    public void deleteExperience(int id){
        rExperience.deleteById(id);
    }
    public Experience showExperience(int id){
        Experience experience = rExperience.findById(id).orElse(null);
        return experience;
    }
}
