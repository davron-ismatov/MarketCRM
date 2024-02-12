package com.example.marketcrm.repository;

import com.example.marketcrm.entity.ReturnDocItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnDocItemsRepository extends JpaRepository<ReturnDocItems,Long> {
}
