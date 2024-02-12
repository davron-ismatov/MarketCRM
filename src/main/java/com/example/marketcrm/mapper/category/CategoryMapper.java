package com.example.marketcrm.mapper.category;

import com.example.marketcrm.dto.category.CategoryDTO;
import com.example.marketcrm.entity.Category;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class CategoryMapper implements EntityMapper<CategoryDTO, Category> {
    @Override
    @Mapping(ignore = true,target = "products")
    public abstract Category toEntity(CategoryDTO dto);
}
