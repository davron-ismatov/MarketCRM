package com.example.marketcrm.mapper.product;

import com.example.marketcrm.dto.product.ProductCreateDTO;
import com.example.marketcrm.entity.Product;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.category.CategoryMapper;
import com.example.marketcrm.mapper.measurement.MeasurementMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {CategoryMapper.class, MeasurementMapper.class})
public abstract class ProductCreateMapper implements EntityMapper<ProductCreateDTO, Product> {
    @Override
    @Mapping(ignore = true,target = "id")
    @Mapping(ignore = true,target = "price")
    public abstract Product toEntity(ProductCreateDTO dto);
}
