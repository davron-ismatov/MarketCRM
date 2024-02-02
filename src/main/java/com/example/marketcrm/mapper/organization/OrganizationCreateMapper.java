package com.example.marketcrm.mapper.organization;

import com.example.marketcrm.dto.organization.OrganizationCreateDTO;
import com.example.marketcrm.entity.Organization;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface OrganizationCreateMapper extends EntityMapper<OrganizationCreateDTO, Organization> {
}
