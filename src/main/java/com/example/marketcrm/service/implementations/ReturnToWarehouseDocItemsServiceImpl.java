package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.returnToWarehouseDocItems.ReturnToWarehouseDocItemsCreateDTO;
import com.example.marketcrm.dto.returnToWarehouseDocItems.ReturnToWarehouseDocItemsDTO;
import com.example.marketcrm.entity.ReturnToWarehouseDocItems;
import com.example.marketcrm.mapper.returnToWarehouseDocItem.ReturnToWarehouseDocItemsCreateMapper;
import com.example.marketcrm.mapper.returnToWarehouseDocItem.ReturnToWarehouseDocItemsMapper;
import com.example.marketcrm.repository.ProductRepository;
import com.example.marketcrm.repository.ReturnToWarehouseDocItemsRepository;
import com.example.marketcrm.repository.ReturnToWarehouseDocRepository;
import com.example.marketcrm.repository.StoreProductRepository;
import com.example.marketcrm.service.ReturnToWarehouseDocItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ReturnToWarehouseDocItemsServiceImpl implements ReturnToWarehouseDocItemService {
    private final ReturnToWarehouseDocItemsRepository repository;
    private final ReturnToWarehouseDocRepository docRepository;
    private final StoreProductRepository storeProductRepository;
    private final ProductRepository productRepository;
    private final ReturnToWarehouseDocItemsCreateMapper createMapper;
    private final ReturnToWarehouseDocItemsMapper mapper;
    @Override
    public Set<ReturnToWarehouseDocItemsDTO> getAllItems() {
        return mapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public ReturnToWarehouseDocItemsDTO getItem(Long id) {
        return mapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    @Override
    public ReturnToWarehouseDocItemsDTO createItem(ReturnToWarehouseDocItemsCreateDTO createDTO) {
        if (!docRepository.existsById(createDTO.getDocument().getId())){
            throw new NoSuchElementException();
        }
        if (!storeProductRepository.existsById(createDTO.getStoreProduct().getId())){
            throw  new NoSuchElementException();
        }
        if (!productRepository.existsById(createDTO.getProduct().getId())){
            throw  new NoSuchElementException();
        }
        ReturnToWarehouseDocItems items = createMapper.toEntity(createDTO);
        items.setDocument(
                docRepository.getReferenceById(createDTO.getDocument().getId())
        );
        items.setProduct(
                productRepository.getReferenceById(createDTO.getProduct().getId())
        );
        items.setStoreProduct(
                storeProductRepository.getReferenceById(createDTO.getStoreProduct().getId())
        );
        repository.save(items);
        return mapper.toDTO(items);
    }

    @Override
    public ReturnToWarehouseDocItemsDTO updateItem(Long id, ReturnToWarehouseDocItemsCreateDTO createDTO) {
        if (!docRepository.existsById(createDTO.getDocument().getId())){
            throw new NoSuchElementException();
        }
        if (!storeProductRepository.existsById(createDTO.getStoreProduct().getId())){
            throw  new NoSuchElementException();
        }
        if (!productRepository.existsById(createDTO.getProduct().getId())){
            throw  new NoSuchElementException();
        }
        ReturnToWarehouseDocItems items = repository.getReferenceById(id);
        items.setDocument(
                docRepository.getReferenceById(createDTO.getDocument().getId())
        );
        items.setProduct(
                productRepository.getReferenceById(createDTO.getProduct().getId())
        );
        items.setStoreProduct(
                storeProductRepository.getReferenceById(createDTO.getStoreProduct().getId())
        );
        items.setCount(createDTO.getCount());
        repository.save(items);
        return mapper.toDTO(items);
    }

    @Override
    public void deleteItem(Long id) {
            repository.deleteById(id);
    }
}
