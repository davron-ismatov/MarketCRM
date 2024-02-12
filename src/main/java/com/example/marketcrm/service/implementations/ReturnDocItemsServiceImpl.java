package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.returnDocItems.ReturnDocItemsCreateDTO;
import com.example.marketcrm.dto.returnDocItems.ReturnDocItemsDTO;
import com.example.marketcrm.entity.ReturnDocItems;
import com.example.marketcrm.mapper.returnDocItem.ReturnDocItemsCreateMapper;
import com.example.marketcrm.mapper.returnDocItem.ReturnDocItemsMapper;
import com.example.marketcrm.repository.ReturnDocItemsRepository;
import com.example.marketcrm.repository.ReturnDocRepository;
import com.example.marketcrm.repository.StoreProductRepository;
import com.example.marketcrm.service.ReturnDocumentItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ReturnDocItemsServiceImpl implements ReturnDocumentItemsService {
    private final ReturnDocItemsRepository repository;
    private final ReturnDocRepository docRepository;
    private final StoreProductRepository productRepository;
    private final ReturnDocItemsMapper mapper;
    private final ReturnDocItemsCreateMapper createMapper;
    @Override
    public Set<ReturnDocItemsDTO> getAllItems() {
        return mapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public ReturnDocItemsDTO getItem(Long id) {
        return mapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    @Override
    public ReturnDocItemsDTO createItem(ReturnDocItemsCreateDTO createDTO) {
        if (!(docRepository.existsById(createDTO.getDocument().getId()) &&
                productRepository.existsById(createDTO.getProduct().getId()))){
            throw new NoSuchElementException();
        }
        ReturnDocItems items = createMapper.toEntity(createDTO);
        items.setDocument(
                docRepository.getReferenceById(createDTO.getDocument().getId())
        );
        items.setProduct(
                productRepository.getReferenceById(createDTO.getProduct().getId())
        );
        repository.save(items);
        return mapper.toDTO(items);
    }

    @Override
    public ReturnDocItemsDTO updateItem(Long id, ReturnDocItemsCreateDTO createDTO) {
        if (!(docRepository.existsById(createDTO.getDocument().getId()) &&
                productRepository.existsById(createDTO.getProduct().getId()))){
            throw new NoSuchElementException();
        }
        ReturnDocItems items = repository.getReferenceById(id);
        items.setDocument(
                docRepository.getReferenceById(createDTO.getDocument().getId())
        );
        items.setProduct(
                productRepository.getReferenceById(createDTO.getProduct().getId())
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
