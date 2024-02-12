package com.example.marketcrm.mapper.productPrice;

import com.example.marketcrm.dto.productPrice.ProductPriceWithoutProductDTO;
import com.example.marketcrm.entity.ProductPrice;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductPriceWithoutProductMapper extends EntityMapper<ProductPriceWithoutProductDTO, ProductPrice> {
    @Override
    @Mapping(ignore = true,target = "product")
    ProductPrice toEntity(ProductPriceWithoutProductDTO dto);
}
