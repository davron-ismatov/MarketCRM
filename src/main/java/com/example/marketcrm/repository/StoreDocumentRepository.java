package com.example.marketcrm.repository;

import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.entity.DocStatus;
import com.example.marketcrm.entity.StoreDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface StoreDocumentRepository extends JpaRepository<StoreDocument,Long> {
    Set<StoreDocument> findArrivalDocumentByStatus(DocStatus status);
    StoreDocument findArrivalDocumentByStatusAndId(DocStatus status,Long id);
}
