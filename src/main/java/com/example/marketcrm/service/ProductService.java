package com.example.marketcrm.service;

import com.example.marketcrm.dto.product.ProductCreateDTO;
import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


public interface ProductService {
    Set<ProductWithCategoryDTO> getAllProducts();

    ProductWithCategoryDTO getProduct(Long id);

    ProductWithCategoryDTO createProduct(ProductCreateDTO createDTO);

    ProductWithCategoryDTO updateProduct(Long id,ProductCreateDTO createDTO);

    void  deleteProduct(Long id);
}
