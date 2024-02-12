package com.example.marketcrm.mapper.organization;

import com.example.marketcrm.dto.organization.OrganizationCreateDTO;
import com.example.marketcrm.entity.Organization;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class OrganizationCreateMapper implements EntityMapper<OrganizationCreateDTO, Organization> {
    @Override
    @Mapping(ignore = true,target = "id")
    @Mapping(ignore = true,target = "documents")
    public abstract Organization toEntity(OrganizationCreateDTO dto);
}
