package com.example.marketcrm.service;

import com.example.marketcrm.dto.productPrice.ProductPriceCreateDTO;
import com.example.marketcrm.dto.productPrice.ProductPriceWithProductDTO;

import java.util.Set;

public interface ProductPriceService {
    Set<ProductPriceWithProductDTO> getAllPrices();

    ProductPriceWithProductDTO getPriceById(Long id);

    ProductPriceWithProductDTO createProductPrice(ProductPriceCreateDTO createDTO);
    ProductPriceWithProductDTO updateProductPrice(ProductPriceCreateDTO createDTO,Long id);
    void deleteProductPrice(Long id);
}
