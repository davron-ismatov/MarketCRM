package com.example.marketcrm.mapper.product;

import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.entity.Product;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductWithCategoryMapper extends EntityMapper<ProductWithCategoryDTO, Product> {
}
