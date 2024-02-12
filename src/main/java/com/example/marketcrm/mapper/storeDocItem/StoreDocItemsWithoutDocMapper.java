package com.example.marketcrm.mapper.storeDocItem;

import com.example.marketcrm.dto.storeDocumentItem.StoreDocItemsWithoutDocDTO;
import com.example.marketcrm.entity.StoreDocumentItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.storeProduct.StoreProductMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {StoreProductMapper.class})
public interface StoreDocItemsWithoutDocMapper extends EntityMapper<StoreDocItemsWithoutDocDTO, StoreDocumentItems> {
    @Override
    @Mapping(ignore = true,target = "document")
    StoreDocumentItems toEntity(StoreDocItemsWithoutDocDTO dto);
}
