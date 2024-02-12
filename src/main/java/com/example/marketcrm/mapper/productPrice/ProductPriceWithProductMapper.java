package com.example.marketcrm.mapper.productPrice;

import com.example.marketcrm.dto.productPrice.ProductPriceWithProductDTO;
import com.example.marketcrm.entity.ProductPrice;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.product.ProductWithoutPriceMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {ProductWithoutPriceMapper.class})
public interface ProductPriceWithProductMapper extends EntityMapper<ProductPriceWithProductDTO, ProductPrice> {

}
