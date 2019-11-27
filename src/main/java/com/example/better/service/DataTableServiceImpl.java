package com.example.better.service;

import com.example.better.entity.DataTable;
import com.example.better.repository.DataTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class DataTableServiceImpl implements DataTableService{
    @Autowired
    private DataTableRepository dataTableRepository;

    @Override
    public List<DataTable> selectAllTable(){
        return dataTableRepository.findAll();
    }

    @Override
    public List<DataTable> selectTableById(long projectId){
        return dataTableRepository.findByProjectId(projectId);
    }

    @Override
    @Transactional
    public DataTable saveNewTable(DataTable dataTable){
        return dataTableRepository.save(dataTable);
    }

    @Override
    @Transactional
    public void removeTable(long id){
        dataTableRepository.deleteById(id);
    }
}
