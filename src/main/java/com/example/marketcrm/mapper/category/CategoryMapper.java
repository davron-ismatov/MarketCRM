package com.example.marketcrm.mapper.category;

import com.example.marketcrm.dto.category.CategoryDTO;
import com.example.marketcrm.entity.Category;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends EntityMapper<CategoryDTO, Category> {
}
