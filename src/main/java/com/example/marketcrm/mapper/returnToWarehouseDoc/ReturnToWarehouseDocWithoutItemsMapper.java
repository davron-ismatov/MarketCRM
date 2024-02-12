package com.example.marketcrm.mapper.returnToWarehouseDoc;

import com.example.marketcrm.dto.returnToWarehouseDoc.ReturnToWarehouseDocWithoutItemsDTO;
import com.example.marketcrm.entity.ReturnToWarehouseDoc;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ReturnToWarehouseDocWithoutItemsMapper extends EntityMapper<ReturnToWarehouseDocWithoutItemsDTO,ReturnToWarehouseDoc> {
    @Override
    @Mapping(ignore = true,target = "items")
    ReturnToWarehouseDoc toEntity(ReturnToWarehouseDocWithoutItemsDTO dto);
}
