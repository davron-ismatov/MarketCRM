package com.example.marketcrm.mapper.category;

import com.example.marketcrm.dto.category.CategoryCreateDTO;
import com.example.marketcrm.entity.Category;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class CategoryCreateMapper implements EntityMapper<CategoryCreateDTO, Category> {
    @Override
    @Mapping(ignore = true,target = "id")
    @Mapping(ignore = true,target = "products")
    public abstract Category toEntity(CategoryCreateDTO dto);
}
