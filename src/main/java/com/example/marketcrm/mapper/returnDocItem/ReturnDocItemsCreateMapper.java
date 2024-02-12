package com.example.marketcrm.mapper.returnDocItem;

import com.example.marketcrm.dto.returnDocItems.ReturnDocItemsCreateDTO;
import com.example.marketcrm.entity.ReturnDocItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.returnDocument.ReturnDocWithoutItemsMapper;
import com.example.marketcrm.mapper.storeProduct.StoreProductMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",uses = {ReturnDocWithoutItemsMapper.class, StoreProductMapper.class})
public interface ReturnDocItemsCreateMapper extends EntityMapper<ReturnDocItemsCreateDTO, ReturnDocItems> {

    @Override
    @Mapping(ignore = true,target = "id")
    ReturnDocItems toEntity(ReturnDocItemsCreateDTO dto);
}
