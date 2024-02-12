package com.example.marketcrm.mapper.sellDocument;

import com.example.marketcrm.dto.sellDocument.SellDocumentWithoutItemsDTO;
import com.example.marketcrm.entity.SellDocument;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class SellDocumentWithoutItemsMapper implements EntityMapper<SellDocumentWithoutItemsDTO, SellDocument> {
    @Override
    @Mapping(ignore = true,target = "items")
    public abstract SellDocument  toEntity(SellDocumentWithoutItemsDTO dto);
}
