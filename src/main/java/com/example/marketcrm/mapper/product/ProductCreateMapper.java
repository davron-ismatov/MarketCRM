package com.example.marketcrm.mapper.product;

import com.example.marketcrm.dto.product.ProductCreateDTO;
import com.example.marketcrm.entity.Product;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface ProductCreateMapper extends EntityMapper<ProductCreateDTO, Product> {
}
