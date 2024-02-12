package com.example.marketcrm.mapper.arrivalDoc;

import com.example.marketcrm.dto.arrivalDoc.ArrivalDocumentCreateDTO;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.organization.OrganizationWithoutDocsMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {OrganizationWithoutDocsMapper.class})
public interface ArrivalDocumentCreateMapper extends EntityMapper<ArrivalDocumentCreateDTO, ArrivalDocument> {
    @Override
    @Mapping(ignore = true,target = "doc_date")
    @Mapping(ignore = true,target = "items")
    @Mapping(ignore = true,target = "doc_number")
    ArrivalDocument toEntity(ArrivalDocumentCreateDTO createDTO);
}
