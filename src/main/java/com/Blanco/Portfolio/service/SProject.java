package com.Blanco.Portfolio.service;

import com.Blanco.Portfolio.entity.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SProject {
    public Project createProject(Project project);

    public List<Project> getProjects();

    public Project getProject(long id);

    public void deleteProject(long id);

    public Project updateProject(Project project, long id);

}
