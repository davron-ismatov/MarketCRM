package com.example.marketcrm.service;

import com.example.marketcrm.dto.category.CategoryCreateDTO;
import com.example.marketcrm.dto.category.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface CategoryService {
    Set<CategoryDTO> getCategories();
    CategoryDTO getCategoryById(Long id);

    CategoryDTO createCategory(CategoryCreateDTO categoryCreateDTO);

    CategoryDTO updateCategory(Long id,CategoryCreateDTO categoryCreateDTO);

    void deleteCategory(Long id);

}
