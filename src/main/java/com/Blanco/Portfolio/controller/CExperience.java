package com.Blanco.Portfolio.controller;

import com.Blanco.Portfolio.entity.Experience;
import com.Blanco.Portfolio.service.SExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("experience")
@CrossOrigin("*")
public class CExperience {
    @Autowired
    SExperience sExperience;

    @GetMapping("/show")
    @ResponseBody
    public List<Experience> showExperiences(){
        return  sExperience.showExperiences();
    }
    @GetMapping("/show/{id}")
    @ResponseBody
    public Experience showExperience(@PathVariable int id){
        return sExperience.showExperience(id);
    }
    @PostMapping("/new")
    public String newExperience(@RequestBody Experience experience){
       sExperience.newExperience(experience);
        return"La experiencia  se creo correctamente.";
    }
    @PutMapping("/update")
    public String  updateExperience(@RequestBody Experience experience){
        sExperience.updateExperience(experience);
        return "La experiencia se elimino correctamente.";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteSkill(@PathVariable int id){
        sExperience.deleteExperience(id);
        return "La experiencia se elimino correctamente.";
    }

}
