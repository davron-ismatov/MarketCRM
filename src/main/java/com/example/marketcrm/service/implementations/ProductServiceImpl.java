package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.product.ProductCreateDTO;
import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.entity.Category;
import com.example.marketcrm.entity.Measurement;
import com.example.marketcrm.entity.Product;
import com.example.marketcrm.mapper.product.ProductCreateMapper;
import com.example.marketcrm.mapper.product.ProductWithCategoryMapper;
import com.example.marketcrm.mapper.productPrice.ProductPriceWithoutProductMapper;
import com.example.marketcrm.repository.CategoryRepository;
import com.example.marketcrm.repository.MeasurementRepository;
import com.example.marketcrm.repository.ProductRepository;
import com.example.marketcrm.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;
    private final ProductCreateMapper createMapper;
    private final ProductWithCategoryMapper mapper;
    private final ProductPriceWithoutProductMapper withoutProductMapper;

    private final CategoryRepository categoryRepository;
    private final MeasurementRepository measurementRepository;

    @Override
    public Set<ProductWithCategoryDTO> getAllProducts() {

        return mapper.toDTOs(new HashSet<>(repository.findAll()))
                .stream()
                .peek(x -> x.setPrice(withoutProductMapper.toDTOs(repository.getProductsFromProductsPrice())))
                .collect(Collectors.toSet());
    }

    @Override
    public ProductWithCategoryDTO getProduct(Long id) {
        ProductWithCategoryDTO categoryDTO = mapper.toDTO(repository.getReferenceById(id));
        categoryDTO.setPrice(Set.of(withoutProductMapper.toDTO(
                repository.getProductsFromProductsPriceById(categoryDTO.getId())
        )));
        return categoryDTO;
    }

    @Override
    public ProductWithCategoryDTO createProduct(ProductCreateDTO createDTO) {
        if (!categoryRepository.existsById(createDTO.getCategory().getId())){
            throw new NoSuchElementException();
        }
        Product product = createMapper.toEntity(createDTO);
        product.setCategory(
                categoryRepository.getReferenceById(product.getCategory().getId())
        );
        product.setUnit(
                measurementRepository.getReferenceById(product.getUnit().getId())
        );
        repository.save(product);
        return mapper.toDTO(product);
    }

    @Override
    public ProductWithCategoryDTO updateProduct(Long id, ProductCreateDTO createDTO) {
        if (!categoryRepository.existsById(createDTO.getCategory().getId())){
            throw new NoSuchElementException();
        }
        Product product = repository.getReferenceById(id);
        product.setCategory(
                categoryRepository.getReferenceById(product.getCategory().getId())
        );
        product.setUnit(
                measurementRepository.getReferenceById(product.getUnit().getId())
        );

        product.setProduct_name(createDTO.getProduct_name());

        product.setAmount(createDTO.getAmount());
        return mapper.toDTO(
                repository.save(product)
        );
    }

    @Override
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
