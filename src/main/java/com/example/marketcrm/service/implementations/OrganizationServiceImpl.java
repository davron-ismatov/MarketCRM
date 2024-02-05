package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.organization.OrganizationCreateDTO;
import com.example.marketcrm.dto.organization.OrganizationDTO;
import com.example.marketcrm.entity.Organization;
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
        return mapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    @Override
    public OrganizationDTO createOrganization(OrganizationCreateDTO createDTO) {
        return mapper.toDTO(
                repository.save(createMapper.toEntity(createDTO))
        );
    }

    @Override
    public OrganizationDTO updateOrganization(Long id, OrganizationCreateDTO createDTO) {
        Organization organization = repository.getReferenceById(id);
        organization.setOrganization_name(createDTO.getOrganization_name());
        organization.setAddress(createDTO.getAddress());
        organization.setDescription(createDTO.getDescription());
        organization.setTellNum(createDTO.getTellNum());
        repository.save(organization);
        return mapper.toDTO(organization);
    }

    @Override
    public void deleteOrganization(Long id) {
        repository.deleteById(id);
    }
}
