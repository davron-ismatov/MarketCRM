package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.category.CategoryCreateDTO;
import com.example.marketcrm.dto.category.CategoryDTO;
import com.example.marketcrm.entity.Category;
import com.example.marketcrm.mapper.category.CategoryCreateMapper;
import com.example.marketcrm.mapper.category.CategoryMapper;
import com.example.marketcrm.repository.CategoryRepository;
import com.example.marketcrm.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository repository;
    private final CategoryMapper mapper;
    private final CategoryCreateMapper createMapper;
    @Override
    public Set<CategoryDTO> getCategories() {
        return  mapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public CategoryDTO getCategoryById(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public CategoryDTO createCategory(CategoryCreateDTO categoryCreateDTO) {
        return mapper.toDTO(repository.save(
                createMapper.toEntity(categoryCreateDTO)
        ));
    }

    @Override
    public CategoryDTO updateCategory(Long id, CategoryCreateDTO categoryCreateDTO) {
        Category category =  repository.getReferenceById(id);
        category.setName(categoryCreateDTO.getName());
        return mapper.toDTO(repository.save(category));
    }

    @Override
    public void deleteCategory(Long id) {
        repository.deleteById(id);
    }
}
