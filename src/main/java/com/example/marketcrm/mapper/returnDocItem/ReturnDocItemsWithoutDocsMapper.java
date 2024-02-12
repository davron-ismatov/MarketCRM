package com.example.marketcrm.mapper.returnDocItem;

import com.example.marketcrm.dto.returnDocItems.ReturnDocItemsWithoutDocsDTO;
import com.example.marketcrm.entity.ReturnDocItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.returnDocument.ReturnDocWithoutItemsMapper;
import com.example.marketcrm.mapper.storeProduct.StoreProductMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {StoreProductMapper.class, ReturnDocWithoutItemsMapper.class})
public interface ReturnDocItemsWithoutDocsMapper extends EntityMapper<ReturnDocItemsWithoutDocsDTO, ReturnDocItems> {
    @Override
    @Mapping(ignore = true,target = "document")
    ReturnDocItems toEntity(ReturnDocItemsWithoutDocsDTO dto);

}
