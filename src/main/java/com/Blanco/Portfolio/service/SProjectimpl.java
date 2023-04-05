package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Project;
import com.Blanco.Portfolio.repository.RProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SProjectimpl implements SProject{
    @Autowired
    private RProject rProject;
    @Override
    public Project createProject(Project  project) {
        return rProject.save(project);
    }

    @Override
    public List<Project> getProjects() {
        return (List<Project>) rProject.findAll();
    }

    @Override
    public Project getProject(long id) {
        return rProject.findById(id).get();
    }

    @Override
    public void deleteProject(long id) {
        rProject.deleteById(id);
    }

    @Override
    public Project updateProject(Project project, long id) {
        Project project1 = rProject.findById(id).get();
        project1.setName(project.getName());
        project1.setProjectImg(project.getProjectImg());
        project1.setProjectLink(project.getProjectLink());
        return rProject.save(project1);
    }
}
