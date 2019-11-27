package com.example.better.repository;

import com.example.better.entity.Relation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelationRepository extends JpaRepository<Relation,Long> {
    List<Relation> findByFromTableId(long FromTableId);
}
