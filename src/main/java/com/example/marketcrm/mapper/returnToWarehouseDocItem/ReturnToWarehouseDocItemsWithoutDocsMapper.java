package com.example.marketcrm.mapper.returnToWarehouseDocItem;

import com.example.marketcrm.dto.returnToWarehouseDocItems.ReturnToWarehouseDocItemsWithoutDocsDTO;
import com.example.marketcrm.entity.ReturnToWarehouseDocItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.product.ProductWithCategoryMapper;
import com.example.marketcrm.mapper.storeProduct.StoreProductMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {StoreProductMapper.class, ProductWithCategoryMapper.class})
public interface ReturnToWarehouseDocItemsWithoutDocsMapper extends EntityMapper<ReturnToWarehouseDocItemsWithoutDocsDTO, ReturnToWarehouseDocItems> {
    @Override
    @Mapping(ignore = true,target = "document")
    ReturnToWarehouseDocItems toEntity(ReturnToWarehouseDocItemsWithoutDocsDTO dto);

}
