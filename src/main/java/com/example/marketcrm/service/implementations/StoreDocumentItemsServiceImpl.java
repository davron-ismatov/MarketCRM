package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.storeDocumentItem.StoreDocItemsCreateDTO;
import com.example.marketcrm.dto.storeDocumentItem.StoreDocItemsDTO;
import com.example.marketcrm.entity.StoreDocumentItems;
import com.example.marketcrm.mapper.storeDocItem.StoreDocItemsCreateMapper;
import com.example.marketcrm.mapper.storeDocItem.StoreDocItemsMapper;
import com.example.marketcrm.repository.StoreDocItemsRepository;
import com.example.marketcrm.repository.StoreDocumentRepository;
import com.example.marketcrm.repository.StoreProductRepository;
import com.example.marketcrm.service.StoreDocItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class StoreDocumentItemsServiceImpl implements StoreDocItemsService {
    private final StoreDocItemsCreateMapper createMapper;
    private final StoreDocItemsRepository repository;
    private final StoreDocItemsMapper mapper;
    private final StoreDocumentRepository documentRepository;
    private final StoreProductRepository productRepository;

    @Override
    public Set<StoreDocItemsDTO> getAllItemsInStore() {
        return mapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public StoreDocItemsDTO getItemsInStore(Long id) {
        return mapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    @Override
    public StoreDocItemsDTO createItemInStore(StoreDocItemsCreateDTO createDTO) {
        if (!(documentRepository.existsById(createDTO.getDocument().getId())
                && productRepository.existsById(createDTO.getProduct().getId()))){
            throw new NoSuchElementException();
        }
        StoreDocumentItems items  = createMapper.toEntity(createDTO);
        items.setDocument(
                documentRepository.getReferenceById(createDTO.getDocument().getId())
        );
        items.setProduct(
                productRepository.getReferenceById(createDTO.getProduct().getId())
        );
        repository.save(items);
        return mapper.toDTO(items);
    }

    @Override
    public StoreDocItemsDTO updateItemInStore(Long id, StoreDocItemsCreateDTO createDTO) {
        if (!(documentRepository.existsById(createDTO.getDocument().getId())
                && productRepository.existsById(createDTO.getProduct().getId()))){
            throw new NoSuchElementException();
        }
        StoreDocumentItems items  = repository.getReferenceById(id);
        items.setDocument(
                documentRepository.getReferenceById(createDTO.getDocument().getId())
        );
        items.setProduct(
                productRepository.getReferenceById(createDTO.getProduct().getId())
        );
        items.setAmount(createDTO.getAmount());
        repository.save(items);
        return mapper.toDTO(items);
    }

    @Override
    public void deleteItemInStore(Long id) {
        repository.deleteById(id);
    }
}
