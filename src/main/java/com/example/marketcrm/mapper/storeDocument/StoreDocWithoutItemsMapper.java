package com.example.marketcrm.mapper.storeDocument;

import com.example.marketcrm.dto.storeDocument.StoreDocWithoutItemsDTO;
import com.example.marketcrm.entity.StoreDocument;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class StoreDocWithoutItemsMapper implements EntityMapper<StoreDocWithoutItemsDTO, StoreDocument> {

    @Override
    @Mapping(ignore = true,target = "items")
    public abstract StoreDocument toEntity(StoreDocWithoutItemsDTO dto);
}
