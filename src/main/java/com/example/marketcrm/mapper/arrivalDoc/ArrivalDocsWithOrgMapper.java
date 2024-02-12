package com.example.marketcrm.mapper.arrivalDoc;

import com.example.marketcrm.dto.arrivalDoc.ArrivalDocsWithOrgDTO;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.organization.OrganizationWithoutDocsMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {OrganizationWithoutDocsMapper.class})
public abstract class ArrivalDocsWithOrgMapper implements EntityMapper<ArrivalDocsWithOrgDTO, ArrivalDocument> {


    @Override
    @Mapping(ignore = true,target = "items")
    public abstract ArrivalDocument toEntity(ArrivalDocsWithOrgDTO dto);
}
