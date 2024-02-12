package com.example.marketcrm.repository;

import com.example.marketcrm.entity.ReturnToWarehouseDocItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnToWarehouseDocItemsRepository extends JpaRepository<ReturnToWarehouseDocItems,Long> {
}
