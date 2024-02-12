package com.example.marketcrm.repository;

import com.example.marketcrm.entity.ReturnDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReturnDocRepository extends JpaRepository<ReturnDocument,Long> {
}
