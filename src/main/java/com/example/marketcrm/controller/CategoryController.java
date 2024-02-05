package com.example.marketcrm.controller;

import com.example.marketcrm.dto.category.CategoryCreateDTO;
import com.example.marketcrm.dto.category.CategoryDTO;
import com.example.marketcrm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/category")
public class CategoryController  {

    @Autowired
    private CategoryService service;

    @GetMapping
    public Set<CategoryDTO> getCategories() {
        return service.getCategories();
    }

    @GetMapping("/{id}")
    public CategoryDTO getCategoryById(@PathVariable Long id) {
        return service.getCategoryById(id);
    }

    @PostMapping
    public CategoryDTO createCategory(@RequestBody CategoryCreateDTO categoryCreateDTO) {
        return service.createCategory(categoryCreateDTO);
    }

    @PutMapping("/{id}")
    public CategoryDTO updateCategory(@PathVariable Long id,@RequestBody CategoryCreateDTO categoryCreateDTO) {
        return service.updateCategory(id,categoryCreateDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        service.deleteCategory(id);
    }
}
