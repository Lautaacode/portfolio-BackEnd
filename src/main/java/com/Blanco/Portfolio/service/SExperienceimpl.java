package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Experience;
import com.Blanco.Portfolio.repository.RExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SExperienceimpl implements SExperience {

    @Autowired
    private RExperience rExperience;
    @Override
    public Experience createExperience(Experience experience) {
        return rExperience.save(experience);
    }

    @Override
    public List<Experience> getExperiences() {
        return (List<Experience>) rExperience.findAll();
    }

    @Override
    public Experience getExperience(long id) {
        return rExperience.findById(id).get();
    }

    @Override
    public void deleteExperience(long id) {
        rExperience.deleteById(id);
    }

    @Override
    public Experience updateExperience(Experience experience, long id) {
        Experience experience1 = rExperience.findById(id).get();
        experience1.setTitleExp(experience.getTitleExp());
        experience1.setImgExp(experience.getImgExp());
        experience1.setDateInitExp(experience.getDateInitExp());
        experience1.setDateEndExp(experience.getDateEndExp());
        experience1.setInstitutionExp(experience.getInstitutionExp());
        experience1.setDescriptionExp(experience.getDescriptionExp());
        return rExperience.save(experience1);
    }
}
