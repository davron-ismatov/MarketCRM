package com.example.marketcrm.repository;

import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.entity.DocStatus;
import com.example.marketcrm.entity.ReturnToWarehouseDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ReturnToWarehouseDocRepository extends JpaRepository<ReturnToWarehouseDoc,Long> {
    Set<ReturnToWarehouseDoc> findArrivalDocumentByStatus(DocStatus status);
    ReturnToWarehouseDoc findArrivalDocumentByStatusAndId(DocStatus status,Long id);
}
