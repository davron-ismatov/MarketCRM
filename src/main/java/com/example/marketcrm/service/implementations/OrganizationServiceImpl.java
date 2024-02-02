package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.organization.OrganizationCreateDTO;
import com.example.marketcrm.dto.organization.OrganizationDTO;
import com.example.marketcrm.mapper.organization.OrganizationCreateMapper;
import com.example.marketcrm.mapper.organization.OrganizationMapper;
import com.example.marketcrm.mapper.organization.OrganizationWithoutDocsMapper;
import com.example.marketcrm.repository.OrganizationRepository;
import com.example.marketcrm.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    private final OrganizationRepository repository;
    private final OrganizationCreateMapper createMapper;
    private final OrganizationMapper mapper;
    private final OrganizationWithoutDocsMapper withoutDocsMapper;
    @Override
    public Set<OrganizationDTO> getAllOrganizations() {
        return mapper.toDTOs(
                new HashSet<>(repository.findAll()
        ));
    }

    @Override
    public OrganizationDTO getOrganization(Long id) {
        return null;
    }

    @Override
    public OrganizationDTO createOrganization(OrganizationCreateDTO createDTO) {
        return null;
    }

    @Override
    public OrganizationDTO updateOrganization(Long id, OrganizationCreateDTO createDTO) {
        return null;
    }

    @Override
    public void deleteOrganization(Long id) {

    }
}
