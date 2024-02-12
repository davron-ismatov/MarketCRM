package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.storeProduct.StoreProductCreateDTO;
import com.example.marketcrm.dto.storeProduct.StoreProductDTO;
import com.example.marketcrm.entity.StoreProduct;
import com.example.marketcrm.mapper.storeProduct.StoreProductCreateMapper;
import com.example.marketcrm.mapper.storeProduct.StoreProductMapper;
import com.example.marketcrm.repository.ProductRepository;
import com.example.marketcrm.repository.StoreProductRepository;
import com.example.marketcrm.service.StoreProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class StoreProductServiceImpl implements StoreProductService {
    private final ProductRepository productRepository;
    private final StoreProductRepository repository;
    private final StoreProductCreateMapper createMapper;
    private final StoreProductMapper mapper;
    @Override
    public Set<StoreProductDTO> getAllProductsInStore() {
        return mapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public StoreProductDTO getProductInStore(Long id) {
        return mapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    @Override
    public StoreProductDTO createProductInStore(StoreProductCreateDTO createDTO) {
        if (!productRepository.existsById(createDTO.getProduct().getId())){
            throw new NoSuchElementException();
        }
        StoreProduct product = createMapper.toEntity(createDTO);
        product.setProduct(
                productRepository.getReferenceById(
                        createDTO.getProduct().getId()
                )
        );
        repository.save(product);

        return mapper.toDTO(product);
    }

    @Override
    public StoreProductDTO updateProductInStore(Long id, StoreProductCreateDTO createDTO) {
        if (!productRepository.existsById(createDTO.getProduct().getId())){
            throw new NoSuchElementException();
        }
        StoreProduct product = repository.getReferenceById(id);
        product.setProduct(
                productRepository.getReferenceById(
                        createDTO.getProduct().getId()
                )
        );
        product.setAmount(createDTO.getAmount());
        repository.save(product);
        return mapper.toDTO(product);
    }

    @Override
    public void deleteProductInStore(Long id) {
            repository.deleteById(id);
    }
}
