package com.example.better.service;

import com.example.better.entity.Project;

import java.util.List;

public interface ProjectService {

    /**
     * 查询所有项目
     * @return
     */
    List<Project> selectAllProject();

    /**
     * 新增项目
     * @param project
     * @return
     */
    Project saveNewProject(Project project);

    /**
     * 删除项目
     * @param id
     */
    void removeProject(long id);
}
