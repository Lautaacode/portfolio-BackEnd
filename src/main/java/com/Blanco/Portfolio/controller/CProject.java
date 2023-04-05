package com.Blanco.Portfolio.controller;

import com.Blanco.Portfolio.entity.Project;
import com.Blanco.Portfolio.service.SProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("project")
@CrossOrigin("*")
public class CProject {
    @Autowired
    private SProject sProject;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public Project createProject(@RequestBody Project project) {
        Project project1 = sProject.createProject(project);
        return project1;
    }

    @GetMapping("/show")
    public List<Project> getProjects() {
        return sProject.getProjects();
    }


    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public Project updateProject(@RequestBody Project project,@PathVariable("id") long id){
        return sProject.updateProject(project,id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public String deleteProject(@PathVariable("id") long id){
        sProject.deleteProject(id);
        return "El Proyecto se elimino correctamente.";
    }
    @GetMapping("/show/{id}")
    public Project getProject(@PathVariable("id") long id){
        return sProject.getProject(id);
    }
}
