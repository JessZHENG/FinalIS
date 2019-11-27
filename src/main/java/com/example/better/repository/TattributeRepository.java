package com.example.better.repository;

import com.example.better.entity.Tattribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TattributeRepository extends JpaRepository<Tattribute,Long> {
    List<Tattribute> findByTableId(long tableId);
}
