package com.example.marketcrm.mapper.organization;

import com.example.marketcrm.dto.organization.OrganizationDTO;
import com.example.marketcrm.entity.Organization;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.arrivalDoc.ArrivalDocumentWithoutOrgMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {ArrivalDocumentWithoutOrgMapper.class})
public interface OrganizationMapper extends EntityMapper<OrganizationDTO, Organization> {
}
