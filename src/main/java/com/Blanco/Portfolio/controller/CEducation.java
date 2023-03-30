package com.Blanco.Portfolio.controller;

import com.Blanco.Portfolio.entity.Education;
import com.Blanco.Portfolio.service.SEducation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("education")
@CrossOrigin(origins = "*")
public class CEducation {
    @Autowired
    private SEducation sEducation;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public Education createEducation(@RequestBody Education education){
        Education education1 = sEducation.createEducation(education);
        return education1;
    }
    @GetMapping("/show")
    public List<Education> getEducations(){
        return sEducation.getEducations();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public Education updateEducation(@RequestBody Education education, @PathVariable("id") long id){
        return sEducation.updateEducation(education,id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public  String deleteEducation(@PathVariable("id") long id){
        sEducation.deleteEducation(id);
        return "La educacion se elimino correctamente";
    }
    @GetMapping("/show/{id}")
    public  Education getEducation(@PathVariable("id") long id){
        return sEducation.getEducation(id);
    }
}
