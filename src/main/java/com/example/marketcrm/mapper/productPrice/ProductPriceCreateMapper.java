package com.example.marketcrm.mapper.productPrice;

import com.example.marketcrm.dto.productPrice.ProductPriceCreateDTO;
import com.example.marketcrm.entity.ProductPrice;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.product.ProductWithCategoryMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {ProductWithCategoryMapper.class})
public abstract class ProductPriceCreateMapper implements EntityMapper<ProductPriceCreateDTO, ProductPrice> {
    @Override
    @Mapping(ignore = true,target = "id")
    @Mapping(ignore = true,target = "date")
    public abstract ProductPrice toEntity(ProductPriceCreateDTO createDTO);
}
