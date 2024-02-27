package com.example.marketcrm.repository;

import com.example.marketcrm.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization,Long> {
    boolean existsByNameIgnoreCase(String name);
}
