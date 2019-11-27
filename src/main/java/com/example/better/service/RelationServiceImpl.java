package com.example.better.service;

import com.example.better.entity.Relation;
import com.example.better.repository.RelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RelationServiceImpl implements RelationService{

    @Autowired
    private RelationRepository relationRepository;

    @Override
    public List<Relation> selectAllRelation(){
        return relationRepository.findAll();
    }

    @Override
    @Transactional
    public Relation saveNewRelation(Relation relation){
        return relationRepository.save(relation);
    }

    @Override
    @Transactional
    public void removeRelation(long id){
        relationRepository.deleteById(id);
    }

    @Override
    public List<Relation> findRelativeTableList(long tableId){
        return relationRepository.findByFromTableId(tableId);
    }
}
