package com.example.marketcrm.mapper.storeProduct;

import com.example.marketcrm.dto.storeProduct.StoreProductCreateDTO;
import com.example.marketcrm.entity.StoreProduct;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.product.ProductWithCategoryMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {ProductWithCategoryMapper.class})
public abstract class StoreProductCreateMapper implements EntityMapper<StoreProductCreateDTO, StoreProduct> {
    @Override
    @Mapping(ignore = true,target = "id")
    @Mapping(ignore = true,target = "items")
    public abstract StoreProduct toEntity(StoreProductCreateDTO createDTO);
}
