package com.Blanco.Portfolio.controller;

import com.Blanco.Portfolio.entity.Skill;
import com.Blanco.Portfolio.service.SSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skill")
@CrossOrigin("*")
public class CSkill {
    @Autowired
    SSkill sSkill;

    @GetMapping("/show")
    @ResponseBody
    public List<Skill> showSkills(){
        return  sSkill.showskills();
    }
    @GetMapping("/show/{id}")
    @ResponseBody
    public Skill showSkill(@PathVariable int id){
        return sSkill.showSkill(id);
    }
    @PostMapping("/new")
    public String newSkill(@RequestBody Skill skill){
        sSkill.newSkill(skill);
        return"El skill se creo correctamente.";
    }
    @PutMapping("/update")
    public String  updateSkill(@RequestBody Skill skill){
        sSkill.updateSkill(skill);
        return "El skill se elimino correctamente.";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteSkill(@PathVariable int id){
        sSkill.deleteSkill(id);
        return "El skill se elimino correctamente.";
    }

}
