package com.example.marketcrm.mapper.returnDocument;

import com.example.marketcrm.dto.returnDocument.ReturnDocWithoutItemsDTO;
import com.example.marketcrm.entity.ReturnDocument;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring")
public interface ReturnDocWithoutItemsMapper extends EntityMapper<ReturnDocWithoutItemsDTO, ReturnDocument> {
    @Override
    @Mapping(ignore = true,target = "items")
    ReturnDocument toEntity(ReturnDocWithoutItemsDTO dto);
}
