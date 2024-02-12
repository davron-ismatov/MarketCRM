package com.example.marketcrm.repository;

import com.example.marketcrm.entity.StoreDocumentItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDocItemsRepository extends JpaRepository<StoreDocumentItems,Long>{
}
