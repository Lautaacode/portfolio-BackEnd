package com.Blanco.Portfolio.controller;


import com.Blanco.Portfolio.entity.Skill;
import com.Blanco.Portfolio.service.SSkill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skill")
@CrossOrigin("*")
public class CSkill {
    @Autowired
    private SSkill sSkill;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public Skill createSkill(@RequestBody Skill skill) {
        Skill skill1 = sSkill.createSkill(skill);
        return skill1;
    }

    @GetMapping("/show")
    public List<Skill> getSkills() {
        return sSkill.getSkills();
    }


    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public Skill updateSkill(@RequestBody Skill skill,@PathVariable("id") long id){
        return sSkill.updateSkill(skill,id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public String deleteSkill(@PathVariable("id") long id){
        sSkill.deleteSkill(id);
        return "La skill se elimino correctamente.";
    }
    @GetMapping("/show/{id}")
    public Skill getSkill(@PathVariable("id") long id){
        return sSkill.getSkill(id);
    }
}
