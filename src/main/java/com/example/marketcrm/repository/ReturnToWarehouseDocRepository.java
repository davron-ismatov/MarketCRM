package com.example.marketcrm.repository;

import com.example.marketcrm.entity.ReturnToWarehouseDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnToWarehouseDocRepository extends JpaRepository<ReturnToWarehouseDoc,Long> {
}
