package com.example.better.repository;

import com.example.better.entity.DataTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataTableRepository extends JpaRepository<DataTable,Long> {
    List<DataTable> findByProjectId(long projectId);
}
