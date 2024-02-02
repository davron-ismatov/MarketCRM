package com.example.marketcrm.repository;

import com.example.marketcrm.entity.ArrivalDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArrivalDocumentRepository extends JpaRepository<ArrivalDocument,Long> {
}
