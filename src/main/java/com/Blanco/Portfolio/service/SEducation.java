package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Education;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SEducation {
    public Education createEducation(Education education);

    public List<Education> getEducations();

    public Education getEducation(long id);

    public void deleteEducation(long id);

    public Education updateEducation(Education education, long id);

}
