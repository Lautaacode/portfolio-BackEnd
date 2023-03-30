package com.Blanco.Portfolio.controller;

import com.Blanco.Portfolio.entity.Experience;
import com.Blanco.Portfolio.service.SExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("experience")
@CrossOrigin(origins = "*")
public class CExperience {
    @Autowired
    private SExperience sExperience;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public Experience createExperience(@RequestBody Experience experience){
        Experience experience1 = sExperience.createExperience(experience);
        return experience1;
    }
    @GetMapping("/show")
    public List<Experience> getExperiences(){
        return  sExperience.getExperiences();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public Experience updateExperience(@RequestBody Experience experience, @PathVariable("id") long id){
        return sExperience.updateExperience(experience,id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public String deleteExperience(@PathVariable("id") long id){
        sExperience.deleteExperience(id);
        return "La experiencia se elimino correctamente.";
    }
    @GetMapping("/show/{id}")
    public Experience getExperience(@PathVariable("id") long id){
        return sExperience.getExperience(id);
    }
}
