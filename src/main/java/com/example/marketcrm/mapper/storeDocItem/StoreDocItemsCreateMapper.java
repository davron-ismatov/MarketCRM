package com.example.marketcrm.mapper.storeDocItem;


import com.example.marketcrm.dto.storeDocumentItem.StoreDocItemsCreateDTO;
import com.example.marketcrm.entity.StoreDocumentItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.product.ProductWithCategoryMapper;
import com.example.marketcrm.mapper.storeDocument.StoreDocWithoutItemsMapper;
import com.example.marketcrm.mapper.storeDocument.StoreDocumentMapper;
import com.example.marketcrm.mapper.storeProduct.StoreProductMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring",uses = {StoreDocWithoutItemsMapper.class, StoreProductMapper.class})
public abstract class StoreDocItemsCreateMapper implements EntityMapper<StoreDocItemsCreateDTO, StoreDocumentItems> {

    @Override
    @Mapping(ignore = true,target = "id")
    public abstract StoreDocumentItems toEntity(StoreDocItemsCreateDTO dto);
}
