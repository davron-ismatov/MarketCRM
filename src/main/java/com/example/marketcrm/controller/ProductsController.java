package com.example.marketcrm.controller;

import com.example.marketcrm.dto.product.ProductCreateDTO;
import com.example.marketcrm.dto.product.ProductWithCategoryDTO;
import com.example.marketcrm.repository.CategoryRepository;
import com.example.marketcrm.service.CategoryService;
import com.example.marketcrm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;
import java.util.Set;

@RestController
@RequestMapping("/product")
public class ProductsController  {
    @Autowired
    private ProductService service;

    @GetMapping
    public Set<ProductWithCategoryDTO> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductWithCategoryDTO getProduct(@PathVariable Long id) {
        return service.getProduct(id);
    }

    @PostMapping
    public ProductWithCategoryDTO createProduct(@RequestBody ProductCreateDTO createDTO) {

        return service.createProduct(createDTO);
    }

    @PutMapping("/{id}")
    public ProductWithCategoryDTO updateProduct(@PathVariable Long id,@RequestBody ProductCreateDTO createDTO) {
        return service.updateProduct(id,createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
    }
}
