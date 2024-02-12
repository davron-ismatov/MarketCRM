package com.example.marketcrm.repository;

import com.example.marketcrm.entity.SellDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellDocumentRepository extends JpaRepository<SellDocument,Long> {
}
