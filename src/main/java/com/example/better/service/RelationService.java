package com.example.better.service;

import com.example.better.entity.Project;
import com.example.better.entity.Relation;

import java.util.List;

public interface RelationService {

    /**
     * 查询所有关系
     * @return
     */
    List<Relation> selectAllRelation();

    /**
     * 新增关系
     * @param relation
     * @return
     */
    Relation saveNewRelation(Relation relation);

    /**
     * 删除关系
     * @param id
     */
    void removeRelation(long id);

    /**
     * 查询相关关系
     * @param tableId
     * @return
     */
    List<Relation> findRelativeTableList(long tableId);
}
