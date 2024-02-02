package com.example.marketcrm.mapper.arrivalDoc;

import com.example.marketcrm.dto.arrivalDoc.ArrivalDocumentWithoutOrgDTO;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArrivalDocumentWithoutOrgMapper extends EntityMapper<ArrivalDocumentWithoutOrgDTO, ArrivalDocument> {
}
