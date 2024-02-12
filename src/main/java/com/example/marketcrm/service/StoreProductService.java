package com.example.marketcrm.service;

import com.example.marketcrm.dto.storeProduct.StoreProductCreateDTO;
import com.example.marketcrm.dto.storeProduct.StoreProductDTO;
import com.example.marketcrm.entity.StoreProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

public interface StoreProductService {
    Set<StoreProductDTO> getAllProductsInStore();
    StoreProductDTO getProductInStore(Long id);

    StoreProductDTO createProductInStore(StoreProductCreateDTO createDTO);

    StoreProductDTO updateProductInStore(Long id,StoreProductCreateDTO createDTO);

    void deleteProductInStore(Long id);
}
