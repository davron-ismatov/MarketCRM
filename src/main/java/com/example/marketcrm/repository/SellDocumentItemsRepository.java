package com.example.marketcrm.repository;

import com.example.marketcrm.entity.SellDocumentItem;
import org.mapstruct.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellDocumentItemsRepository extends JpaRepository<SellDocumentItem,Long> {
}
