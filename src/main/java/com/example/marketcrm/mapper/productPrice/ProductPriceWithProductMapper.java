package com.example.marketcrm.mapper.productPrice;

import com.example.marketcrm.dto.productPrice.ProductPriceWithProductDTO;
import com.example.marketcrm.entity.ProductPrice;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductPriceWithProductMapper extends EntityMapper<ProductPriceWithProductDTO, ProductPrice> {
}
