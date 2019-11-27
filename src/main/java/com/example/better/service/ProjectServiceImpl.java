package com.example.better.service;

import com.example.better.entity.Project;
import com.example.better.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> selectAllProject(){
        return projectRepository.findAll();
    }

    @Override
    @Transactional
    public Project saveNewProject(Project project){
        return projectRepository.save(project);
    }

    @Override
    @Transactional
    public void removeProject(long id){
        projectRepository.deleteById(id);
    }
}
