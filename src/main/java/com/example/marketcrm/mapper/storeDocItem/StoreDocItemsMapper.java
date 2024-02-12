package com.example.marketcrm.mapper.storeDocItem;

import com.example.marketcrm.dto.storeDocumentItem.StoreDocItemsDTO;
import com.example.marketcrm.entity.StoreDocumentItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.storeDocument.StoreDocWithoutItemsMapper;
import com.example.marketcrm.mapper.storeProduct.StoreProductMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {StoreDocWithoutItemsMapper.class, StoreProductMapper.class})
public interface StoreDocItemsMapper extends EntityMapper<StoreDocItemsDTO, StoreDocumentItems> {
}
