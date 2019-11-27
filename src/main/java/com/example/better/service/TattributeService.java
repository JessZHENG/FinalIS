package com.example.better.service;

import com.example.better.entity.Project;
import com.example.better.entity.Tattribute;

import java.util.List;

public interface TattributeService {

    /**
     * 查询所有属性
     * @return
     */
    List<Tattribute> selectAllTattribute();

    /**
     * 查询一张表的所有属性
     * @param tableId
     * @return
     */
    List<Tattribute> selectTattributeByTableId(long tableId);

    /**
     * 新增属性
     * @param tattribute
     * @return
     */
    Tattribute saveNewTattribute(Tattribute tattribute);

    /**
     * 删除属性
     * @param id
     */
    void removeTattribute(long id);
}
