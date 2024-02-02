package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.product.ProductCreateDTO;
import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.entity.Category;
import com.example.marketcrm.entity.Product;
import com.example.marketcrm.mapper.product.ProductCreateMapper;
import com.example.marketcrm.mapper.product.ProductWithCategoryMapper;
import com.example.marketcrm.repository.ProductRepository;
import com.example.marketcrm.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;
    private final ProductCreateMapper createMapper;
    private final ProductWithCategoryMapper mapper;

    @Override
    public Set<ProductWithCategoryDTO> getAllProducts() {
        return mapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public ProductWithCategoryDTO getProduct(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public ProductWithCategoryDTO createProduct(ProductCreateDTO createDTO) {
        return mapper.toDTO(
                createMapper.toEntity(createDTO)
        );
    }

    @Override
    public ProductWithCategoryDTO updateProduct(Long id, ProductCreateDTO createDTO) {
        Product product = repository.getReferenceById(id);
        product.setProduct_name(createDTO.getProduct_name());
        product.setCategory(Category.builder()
                .id(createDTO.getCategory().getId())
                .build());
        product.setUnit(createDTO.getUnit());
        product.setPrice(createDTO.getPrice());
        product.setAmount(createDTO.getAmount());

        return mapper.toDTO(repository.save(product));
    }

    @Override
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
