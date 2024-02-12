package com.example.marketcrm.mapper.arrivalDoc;

import com.example.marketcrm.dto.arrivalDoc.ArrivalDocsWithOrgDTO;
import com.example.marketcrm.dto.arrivalDoc.ArrivalDocumentWithoutOrgDTO;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.arrivalDocItem.ArrivalDocItemWithProductsMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {ArrivalDocItemWithProductsMapper.class})
public abstract class ArrivalDocumentWithoutOrgMapper implements EntityMapper<ArrivalDocumentWithoutOrgDTO, ArrivalDocument> {

    @Mapping(ignore = true,target = "organization")
    @Override
    public abstract ArrivalDocument toEntity(ArrivalDocumentWithoutOrgDTO document);
}
