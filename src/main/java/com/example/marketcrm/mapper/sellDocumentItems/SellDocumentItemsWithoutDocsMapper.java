package com.example.marketcrm.mapper.sellDocumentItems;

import com.example.marketcrm.dto.sellDocumentItem.SellDocumentItemsWithoutDocsDTO;
import com.example.marketcrm.entity.SellDocumentItem;
import com.example.marketcrm.entity.StoreDocumentItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.storeProduct.StoreProductMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {StoreProductMapper.class})
public abstract class SellDocumentItemsWithoutDocsMapper implements EntityMapper<SellDocumentItemsWithoutDocsDTO, SellDocumentItem> {

    @Override
    @Mapping(ignore = true,target = "document")
    public abstract SellDocumentItem toEntity(SellDocumentItemsWithoutDocsDTO dto);
}
