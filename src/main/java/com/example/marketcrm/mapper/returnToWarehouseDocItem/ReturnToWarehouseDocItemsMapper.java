package com.example.marketcrm.mapper.returnToWarehouseDocItem;

import com.example.marketcrm.dto.returnToWarehouseDocItems.ReturnToWarehouseDocItemsDTO;
import com.example.marketcrm.entity.ReturnToWarehouseDocItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.product.ProductWithCategoryMapper;
import com.example.marketcrm.mapper.returnToWarehouseDoc.ReturnToWarehouseDocWithoutItemsMapper;
import com.example.marketcrm.mapper.storeProduct.StoreProductMapper;
import org.mapstruct.Mapper;

@Mapper(
        componentModel = "spring",
        uses = {ReturnToWarehouseDocWithoutItemsMapper.class, StoreProductMapper.class, ProductWithCategoryMapper.class}
)
public interface ReturnToWarehouseDocItemsMapper extends EntityMapper<ReturnToWarehouseDocItemsDTO, ReturnToWarehouseDocItems> {
}
