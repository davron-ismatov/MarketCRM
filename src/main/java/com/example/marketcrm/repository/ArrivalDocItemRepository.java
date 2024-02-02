package com.example.marketcrm.repository;

import com.example.marketcrm.entity.ArrivalDocItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArrivalDocItemRepository extends JpaRepository<ArrivalDocItems,Long> {
}
