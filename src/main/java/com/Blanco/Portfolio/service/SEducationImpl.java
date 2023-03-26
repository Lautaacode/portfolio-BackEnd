package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Education;
import com.Blanco.Portfolio.repository.REducation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SEducationImpl implements  SEducation{

    @Autowired
    private REducation rEducation;
    @Override
    public Education createEducation(Education education) {
        return rEducation.save(education);
    }

    @Override
    public List<Education> getEducations() {
        return (List<Education>) rEducation.findAll();
    }

    @Override
    public Education getEducation(long id) {
        return rEducation.findById(id).get();
    }

    @Override
    public void deleteEducation(long id) {
        rEducation.deleteById(id);
    }

    @Override
    public Education updateEducation(Education education, long id) {
        Education education1 = rEducation.findById(id).get();
        education1.setTitleEdu(education.getTitleEdu());
        education1.setImgEdu(education.getImgEdu());
        education1.setDateInitEdu(education.getDateInitEdu());
        education1.setDateEndEdu(education.getDateEndEdu());
        education1.setInstitutionEdu(education.getInstitutionEdu());
        education1.setDescriptionEdu(education.getDescriptionEdu());
        return rEducation.save(education1);
    }
}
