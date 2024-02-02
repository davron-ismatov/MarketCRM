package com.example.marketcrm.mapper.organization;

import com.example.marketcrm.dto.organization.OrganizationDTO;
import com.example.marketcrm.entity.Organization;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface OrganizationMapper extends EntityMapper<OrganizationDTO, Organization> {
}
