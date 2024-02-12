package com.example.marketcrm.mapper.product;

import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.entity.Product;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.category.CategoryMapper;
import com.example.marketcrm.mapper.measurement.MeasurementMapper;
import com.example.marketcrm.mapper.productPrice.ProductPriceWithoutProductMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {CategoryMapper.class, MeasurementMapper.class, ProductPriceWithoutProductMapper.class})
public interface ProductWithCategoryMapper extends EntityMapper<ProductWithCategoryDTO, Product> {
}
