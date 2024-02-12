package com.example.marketcrm.mapper.sellDocumentItems;

import com.example.marketcrm.dto.sellDocumentItem.SellDocumentItemsDTO;
import com.example.marketcrm.entity.SellDocumentItem;
import com.example.marketcrm.entity.StoreDocumentItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.sellDocument.SellDocumentWithoutItemsMapper;
import com.example.marketcrm.mapper.storeProduct.StoreProductMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {SellDocumentWithoutItemsMapper.class, StoreProductMapper.class})
public interface SellDocumentItemsMapper extends EntityMapper<SellDocumentItemsDTO, SellDocumentItem> {
}
