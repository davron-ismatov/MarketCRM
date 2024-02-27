package com.example.marketcrm.repository;

import com.example.marketcrm.dto.expences.ExpensesDTO;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.entity.DocStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.sql.Date;
import java.util.List;
import java.util.Set;

@Repository
public interface ArrivalDocumentRepository extends JpaRepository<ArrivalDocument,Long> {
    Set<ArrivalDocument> findArrivalDocumentByStatus(DocStatus status);
    ArrivalDocument findArrivalDocumentByStatusAndId(DocStatus status,Long id);

    @Query(value = "select ad from ArrivalDocument ad inner join Organization o on ad.organization.id = o.id where o.name=:org_name and ad.doc_date between :from_date and :to_date and ad.status =:status")
    List<ArrivalDocument> getDocForExpenses(@Param("org_name") String name, @Param("from_date") Date date, @Param("to_date") Date to_date, @Param("status") String  status);

    @Query(value = "select ad from ArrivalDocument ad inner join Organization o on ad.organization.id = o.id where   ad.doc_date between :from_date and :to_date and ad.status =:status")
    List<ArrivalDocument> getDocForExpenses( @Param("from_date") Date date, @Param("to_date") Date to_date,@Param("status") String  status);

    @Query(value = "select ad from ArrivalDocument ad inner join Organization o on ad.organization.id = o.id where o.name=:org_name and ad.status =:status")
    List<ArrivalDocument> getDocForExpenses(@Param("org_name") String name,@Param("status") String  status);
}
