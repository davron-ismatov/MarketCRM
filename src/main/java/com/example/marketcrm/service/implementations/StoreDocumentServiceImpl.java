package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.storeDocument.StoreDocumentCreateDTO;
import com.example.marketcrm.dto.storeDocument.StoreDocumentDTO;
import com.example.marketcrm.mapper.storeDocument.StoreDocumentCreateMapper;
import com.example.marketcrm.mapper.storeDocument.StoreDocumentMapper;
import com.example.marketcrm.repository.StoreDocumentRepository;
import com.example.marketcrm.service.StoreDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class StoreDocumentServiceImpl implements StoreDocumentService {
    private final StoreDocumentRepository repository;
    private final StoreDocumentCreateMapper createMapper;
    private final StoreDocumentMapper mapper;
    @Override
    public Set<StoreDocumentDTO> getAllStoreDocs() {
        return mapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public StoreDocumentDTO getStoreDocument(Long id) {
        return mapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    @Override
    public StoreDocumentDTO createStoreDoc(StoreDocumentCreateDTO createDTO) {
        return mapper.toDTO(repository.save(
                createMapper.toEntity(createDTO)
        )
        );
    }

    @Override
    public StoreDocumentDTO updateStoreDoc(Long id, StoreDocumentCreateDTO createDTO) {
        return null;
    }

    @Override
    public void deleteStoreDoc(Long id) {
        repository.deleteById(id);
    }
}
