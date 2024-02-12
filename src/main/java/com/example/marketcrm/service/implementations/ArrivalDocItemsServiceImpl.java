package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemCreateDTO;
import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemDTO;
import com.example.marketcrm.entity.ArrivalDocItems;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.entity.Product;
import com.example.marketcrm.mapper.arrivalDocItem.ArrivalDocItemMapper;
import com.example.marketcrm.mapper.arrivalDocItem.ArrivalDocItemWithProductsMapper;
import com.example.marketcrm.mapper.arrivalDocItem.ArrivalDocItemsCreateMapper;
import com.example.marketcrm.repository.ArrivalDocItemRepository;
import com.example.marketcrm.repository.ArrivalDocumentRepository;
import com.example.marketcrm.repository.ProductRepository;
import com.example.marketcrm.service.ArrivalDocItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ArrivalDocItemsServiceImpl implements ArrivalDocItemsService {
    private final ArrivalDocItemRepository repository;
    private final ArrivalDocItemMapper itemMapper;
    private final ArrivalDocItemsCreateMapper createMapper;
    private final ArrivalDocItemWithProductsMapper withProductsMapper;
    private final ArrivalDocumentRepository documentRepository;
    private final ProductRepository productRepository;
    @Override
    public Set<ArrivalDocItemDTO> getAllDocItems() {

        return itemMapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public ArrivalDocItemDTO getDocItem(Long id) {
        return itemMapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    @Override
    public ArrivalDocItemDTO createDocItem(ArrivalDocItemCreateDTO createDTO) {
        if (!(documentRepository.existsById(createDTO.getDocument().getId())
            && productRepository.existsById(createDTO.getProducts().getId()))){
            throw new NoSuchElementException();
        }
        ArrivalDocItems docItems = createMapper.toEntity(createDTO);

        docItems.setProducts(
                productRepository.getReferenceById(docItems.getProducts().getId())
        );
        docItems.setDocument(
                documentRepository.getReferenceById(docItems.getDocument().getId())
        );
        repository.save(docItems);
        return itemMapper.toDTO(docItems);
    }

    @Override
    public ArrivalDocItemDTO updateDocItem(Long id, ArrivalDocItemCreateDTO createDTO) {
        if (!(documentRepository.existsById(createDTO.getDocument().getId())
                || productRepository.existsById(createDTO.getProducts().getId()))){
            throw new NoSuchElementException();
        }
        ArrivalDocItems docItems = repository.getReferenceById(id);


        docItems.setProducts(
                productRepository.getReferenceById(docItems.getProducts().getId())
        );
        docItems.setDocument(
                documentRepository.getReferenceById(docItems.getDocument().getId()));


        docItems.setArrival_price(createDTO.getArrival_price());



        docItems.setCount(createDTO.getCount());


        return itemMapper.toDTO(
                repository.save(docItems)
        );
    }

    @Override
    public void deleteDocItem(Long id) {
        repository.deleteById(id);
    }
}
