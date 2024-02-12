package com.example.marketcrm.controller;

import com.example.marketcrm.dto.storeProduct.StoreProductCreateDTO;
import com.example.marketcrm.dto.storeProduct.StoreProductDTO;
import com.example.marketcrm.service.StoreProductService;
import com.example.marketcrm.service.implementations.StoreProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/store-product")
@RequiredArgsConstructor
public class StoreProductController {
    private final StoreProductServiceImpl service;

    @GetMapping
    public Set<StoreProductDTO> getAllProductsInStore() {
        return service.getAllProductsInStore();
    }

    @GetMapping("/{id}")
    public StoreProductDTO getProductInStore(@PathVariable Long id) {
        return service.getProductInStore(id);
    }

    @PostMapping
    public StoreProductDTO createProductInStore(@RequestBody StoreProductCreateDTO createDTO) {
        return service.createProductInStore(createDTO);
    }

    @PutMapping("/{id}")
    public StoreProductDTO updateProductInStore(@PathVariable Long id,@RequestBody StoreProductCreateDTO createDTO) {
        return service.updateProductInStore(id,createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteProductInStore(@PathVariable Long id) {
        service.deleteProductInStore(id);
    }
}
