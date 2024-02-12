package com.example.marketcrm.mapper.arrivalDoc;

import com.example.marketcrm.dto.arrivalDoc.ArrivalDocDTO;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.arrivalDocItem.ArrivalDocItemWithProductsMapper;
import com.example.marketcrm.mapper.organization.OrganizationWithoutDocsMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {OrganizationWithoutDocsMapper.class, ArrivalDocItemWithProductsMapper.class})
public interface ArrivalDocMapper extends EntityMapper<ArrivalDocDTO, ArrivalDocument> {
}
