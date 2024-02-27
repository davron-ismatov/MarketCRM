package com.example.marketcrm.repository;

import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.entity.DocStatus;
import com.example.marketcrm.entity.SellDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Repository
public interface SellDocumentRepository extends JpaRepository<SellDocument,Long> {
    Set<SellDocument> findArrivalDocumentByStatus(DocStatus status);
    SellDocument findArrivalDocumentByStatusAndId(DocStatus status,Long id);


}
