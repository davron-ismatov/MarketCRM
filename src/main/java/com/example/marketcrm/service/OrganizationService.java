package com.example.marketcrm.service;

import com.example.marketcrm.dto.organization.OrganizationCreateDTO;
import com.example.marketcrm.dto.organization.OrganizationDTO;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface OrganizationService {
        Set<OrganizationDTO> getAllOrganizations();
        OrganizationDTO getOrganization(Long id);

        OrganizationDTO createOrganization(OrganizationCreateDTO createDTO);

        OrganizationDTO updateOrganization(Long id,OrganizationCreateDTO createDTO);
        void deleteOrganization(Long id);
}
