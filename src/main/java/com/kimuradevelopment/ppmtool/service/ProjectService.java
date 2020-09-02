package com.kimuradevelopment.ppmtool.service;

import com.kimuradevelopment.ppmtool.domain.Project;
import com.kimuradevelopment.ppmtool.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    // Want to have your logic extracted for the controller as much as possible
    // Want Controller to work more like a router
    // Better to use the Service layer to have the logic to talk to repository
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        // Logic
        return projectRepository.save(project);
    }
}
