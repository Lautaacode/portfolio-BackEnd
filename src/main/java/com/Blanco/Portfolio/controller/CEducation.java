package com.Blanco.Portfolio.controller;

import com.Blanco.Portfolio.entity.Education;
import com.Blanco.Portfolio.entity.Experience;
import com.Blanco.Portfolio.service.SEducation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("education")
@CrossOrigin("*")
public class CEducation {
    @Autowired
    SEducation  sEducation;

    @GetMapping("/show")
    @ResponseBody
    public List<Education> showExducations(){

        return  sEducation.showEducations();
    }
    @GetMapping("/show/{id}")
    @ResponseBody
    public Education showEducation(@PathVariable int id){

        return sEducation.showEducation(id);
    }
    @PostMapping("/new")
    public String newEducation(@RequestBody Education education){
        sEducation.newEducation(education);
        return"La educacion  se creo correctamente.";
    }
    @PutMapping("/update")
    public String  updateExperience(@RequestBody Education education){
        sEducation.updateEducation(education);
        return "La educacion se edito correctamente.";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteSkill(@PathVariable int id){
        sEducation.deleteEducation(id);
        return "La educacion se elimino correctamente.";
    }
}
