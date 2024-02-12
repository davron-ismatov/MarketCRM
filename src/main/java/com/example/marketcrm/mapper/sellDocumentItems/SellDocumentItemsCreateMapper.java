package com.example.marketcrm.mapper.sellDocumentItems;

import com.example.marketcrm.dto.sellDocumentItem.SellDocumentItemsCreateDTO;
import com.example.marketcrm.entity.SellDocumentItem;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.sellDocument.SellDocumentWithoutItemsMapper;
import com.example.marketcrm.mapper.storeProduct.StoreProductMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {SellDocumentWithoutItemsMapper.class, StoreProductMapper.class})
public interface SellDocumentItemsCreateMapper extends EntityMapper<SellDocumentItemsCreateDTO, SellDocumentItem> {
    @Override
    @Mapping(ignore = true,target = "id")
    SellDocumentItem toEntity(SellDocumentItemsCreateDTO dto);
}
