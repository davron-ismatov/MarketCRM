package com.example.marketcrm.mapper.productPrice;

import com.example.marketcrm.dto.productPrice.ProductPriceCreateDTO;
import com.example.marketcrm.entity.ProductPrice;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductPriceCreateMapper extends EntityMapper<ProductPriceCreateDTO, ProductPrice> {
}
