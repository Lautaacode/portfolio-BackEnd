package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Experience;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SExperience {

    public Experience createExperience(Experience experience);

    public List<Experience> getExperiences();

    public Experience getExperience(long id);

    public void deleteExperience(long id);

    public Experience updateExperience(Experience experience, long id);

}
