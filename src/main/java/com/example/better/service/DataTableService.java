package com.example.better.service;

import com.example.better.entity.DataTable;
import com.example.better.entity.Project;

import javax.xml.crypto.Data;
import java.util.List;

public interface DataTableService {

    /**
     * 查询所有表
     * @return
     */
    List<DataTable> selectAllTable();

    /**
     * 返回一个项目所有表
     * @param projectId
     * @return
     */
    List<DataTable> selectTableById(long projectId);

    /**
     * 新增表
     * @param dataTable
     * @return
     */
    DataTable saveNewTable(DataTable dataTable);

    /**
     * 删除表
     * @param id
     */
    void removeTable(long id);
}
