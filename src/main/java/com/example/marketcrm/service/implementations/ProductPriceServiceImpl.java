package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.productPrice.ProductPriceCreateDTO;
import com.example.marketcrm.dto.productPrice.ProductPriceWithProductDTO;
import com.example.marketcrm.entity.Product;
import com.example.marketcrm.entity.ProductPrice;
import com.example.marketcrm.mapper.productPrice.ProductPriceCreateMapper;
import com.example.marketcrm.mapper.productPrice.ProductPriceWithProductMapper;
import com.example.marketcrm.mapper.productPrice.ProductPriceWithoutProductMapper;
import com.example.marketcrm.repository.ProductPriceRepository;
import com.example.marketcrm.repository.ProductRepository;
import com.example.marketcrm.service.ProductPriceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ProductPriceServiceImpl implements ProductPriceService {
    private final ProductPriceRepository repository;
    private final ProductPriceCreateMapper createMapper;
    private final ProductPriceWithoutProductMapper withoutProductMapper;
    private final ProductPriceWithProductMapper withProductMapper;
    private final ProductRepository productRepository;

    @Override
    public Set<ProductPriceWithProductDTO> getAllPrices() {
        return withProductMapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public ProductPriceWithProductDTO getPriceById(Long id) {
        return withProductMapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    @Override
    public ProductPriceWithProductDTO createProductPrice(ProductPriceCreateDTO createDTO) {
        if (!productRepository.existsById(createDTO.getProduct().getId())){
            throw new NoSuchElementException();
        }

        ProductPrice productPrice = createMapper.toEntity(createDTO);

        productPrice.setProduct(
                productRepository.getReferenceById(
                productPrice.getProduct().getId()
        ));

        repository.save(productPrice);

        return withProductMapper.toDTO(productPrice);
    }

    @Override
    public ProductPriceWithProductDTO updateProductPrice(ProductPriceCreateDTO createDTO, Long id) {
        ProductPrice productPrice = repository.getReferenceById(id);
        productPrice.setProduct(Product.builder()
                        .id(createDTO.getProduct().getId())
                .build());
        productPrice.setPrice(createDTO.getPrice());
        return withProductMapper.toDTO(
                repository.save(productPrice));
    }

    @Override
    public void deleteProductPrice(Long id) {
            repository.deleteById(id);
    }
}
