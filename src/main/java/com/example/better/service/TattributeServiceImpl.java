package com.example.better.service;

import com.example.better.entity.Tattribute;
import com.example.better.repository.TattributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TattributeServiceImpl implements TattributeService{

    @Autowired
    private TattributeRepository tattributeRepository;

    @Override
    public List<Tattribute> selectAllTattribute(){
        return tattributeRepository.findAll();
    }

    @Override
    public List<Tattribute> selectTattributeByTableId(long tableId){
        return tattributeRepository.findByTableId(tableId);
    }

    @Override
    @Transactional
    public Tattribute saveNewTattribute(Tattribute tattribute){
        return tattributeRepository.save(tattribute);
    }

    @Override
    @Transactional
    public void removeTattribute(long id){
        tattributeRepository.deleteById(id);
    }
}
