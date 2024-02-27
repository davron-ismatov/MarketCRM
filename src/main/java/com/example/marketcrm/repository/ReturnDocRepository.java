package com.example.marketcrm.repository;

import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.entity.DocStatus;
import com.example.marketcrm.entity.ReturnDocument;
import com.example.marketcrm.entity.ReturnToWarehouseDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ReturnDocRepository extends JpaRepository<ReturnDocument,Long> {
    Set<ReturnDocument> findArrivalDocumentByStatus(DocStatus status);
    ReturnDocument findArrivalDocumentByStatusAndId(DocStatus status,Long id);
}
