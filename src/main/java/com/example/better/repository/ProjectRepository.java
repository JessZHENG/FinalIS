package com.example.better.repository;

import com.example.better.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    /*
    查询所有项目
     */
    List<Project> findAll();
}
