package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.sellDocumentItem.SellDocumentItemsCreateDTO;
import com.example.marketcrm.dto.sellDocumentItem.SellDocumentItemsDTO;
import com.example.marketcrm.entity.SellDocumentItem;
import com.example.marketcrm.mapper.sellDocumentItems.SellDocumentItemsCreateMapper;
import com.example.marketcrm.mapper.sellDocumentItems.SellDocumentItemsMapper;
import com.example.marketcrm.repository.SellDocumentItemsRepository;
import com.example.marketcrm.repository.SellDocumentRepository;
import com.example.marketcrm.repository.StoreProductRepository;
import com.example.marketcrm.service.SellDocumentItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SellDocumentItemsServiceImpl implements SellDocumentItemsService {
    private final SellDocumentItemsRepository repository;
    private final SellDocumentItemsCreateMapper createMapper;
    private final SellDocumentItemsMapper mapper;
    private final SellDocumentRepository documentRepository;
    private final StoreProductRepository productRepository;
    @Override
    public Set<SellDocumentItemsDTO> getAllSellDocsItems() {
        return mapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public SellDocumentItemsDTO getSellDocItem(Long id) {
        return mapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    @Override
    public SellDocumentItemsDTO createSellDocItem(SellDocumentItemsCreateDTO createDTO) {
        if (!(documentRepository.existsById(createDTO.getDocument().getId())&&
                productRepository.existsById(createDTO.getProduct().getId()))){
            throw new NoSuchElementException();
        }
        SellDocumentItem item = createMapper.toEntity(createDTO);
        item.setDocument(
                documentRepository.getReferenceById(createDTO.getDocument().getId())
        );
        item.setProduct(
                productRepository.getReferenceById(createDTO.getProduct().getId())
        );
        repository.save(item);
        return mapper.toDTO(item);
    }

    @Override
    public SellDocumentItemsDTO updateSellDocItem(Long id, SellDocumentItemsCreateDTO createDTO) {
        if (!(documentRepository.existsById(createDTO.getDocument().getId())&&
                productRepository.existsById(createDTO.getProduct().getId()))){
            throw new NoSuchElementException();
        }
        SellDocumentItem item = repository.getReferenceById(id);
        item.setDocument(
                documentRepository.getReferenceById(createDTO.getDocument().getId())
        );
        item.setProduct(
                productRepository.getReferenceById(createDTO.getProduct().getId())
        );
        item.setPrice(createDTO.getPrice());
        item.setCount(createDTO.getCount());
        repository.save(item);
        return mapper.toDTO(item);
    }

    @Override
    public void deleteSellDocItem(Long id) {
        repository.deleteById(id);
    }
}
