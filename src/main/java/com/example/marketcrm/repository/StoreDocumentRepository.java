package com.example.marketcrm.repository;

import com.example.marketcrm.entity.StoreDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreDocumentRepository extends JpaRepository<StoreDocument,Long> {
}
