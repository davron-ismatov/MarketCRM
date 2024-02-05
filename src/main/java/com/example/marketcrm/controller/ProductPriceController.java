package com.example.marketcrm.controller;

import com.example.marketcrm.dto.productPrice.ProductPriceCreateDTO;
import com.example.marketcrm.dto.productPrice.ProductPriceWithProductDTO;
import com.example.marketcrm.service.ProductPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/product-price")
public class ProductPriceController  {
    @Autowired
    private ProductPriceService service;
    @GetMapping
    public Set<ProductPriceWithProductDTO> getAllPrices() {
        return service.getAllPrices();
    }

    @GetMapping("/{id}")
    public ProductPriceWithProductDTO getPriceById(@PathVariable Long id) {
        return service.getPriceById(id);
    }

    @PostMapping
    public ProductPriceWithProductDTO createProductPrice(@RequestBody ProductPriceCreateDTO createDTO) {
        return service.createProductPrice(createDTO);
    }

    @PutMapping("/{id}")
    public ProductPriceWithProductDTO updateProductPrice(@RequestBody ProductPriceCreateDTO createDTO,@PathVariable Long id) {
        return service.updateProductPrice(createDTO,id);
    }

    @DeleteMapping("/{id}")
    public void deleteProductPrice(@PathVariable Long id) {
        service.deleteProductPrice(id);
    }
}
