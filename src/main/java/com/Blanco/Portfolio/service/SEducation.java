package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Education;
import com.Blanco.Portfolio.repository.REducation;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SEducation {
    @Autowired
    public REducation rEducation;
    public List<Education> showEducations(){
        List<Education> listEducation = rEducation.findAll();
        return listEducation;
    }
    public void newEducation(Education education){
        rEducation.save(education);
    }
    public void updateEducation(Education education){
        rEducation.save(education);
    }
    public void deleteEducation(int id){
        rEducation.deleteById(id);
    }
    public Education showEducation(int id){
        Education education = rEducation.findById(id).orElse(null);
        return education;
    }
}
