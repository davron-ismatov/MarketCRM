package com.example.marketcrm.mapper.returnToWarehouseDocItem;

import com.example.marketcrm.dto.returnToWarehouseDocItems.ReturnToWarehouseDocItemsCreateDTO;
import com.example.marketcrm.entity.ReturnToWarehouseDocItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.product.ProductWithCategoryMapper;
import com.example.marketcrm.mapper.returnToWarehouseDoc.ReturnToWarehouseDocWithoutItemsMapper;
import com.example.marketcrm.mapper.storeProduct.StoreProductMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(
        componentModel = "spring",
        uses = {ReturnToWarehouseDocWithoutItemsMapper.class, StoreProductMapper.class, ProductWithCategoryMapper.class}
)
public interface ReturnToWarehouseDocItemsCreateMapper extends EntityMapper<ReturnToWarehouseDocItemsCreateDTO, ReturnToWarehouseDocItems> {
    @Override
    @Mapping(ignore = true,target = "id")
    ReturnToWarehouseDocItems toEntity(ReturnToWarehouseDocItemsCreateDTO dto);
}
