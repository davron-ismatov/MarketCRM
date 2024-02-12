package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.sellDocument.SellDocumentCreateDTO;
import com.example.marketcrm.dto.sellDocument.SellDocumentDTO;
import com.example.marketcrm.mapper.sellDocument.SellDocumentCreateMapper;
import com.example.marketcrm.mapper.sellDocument.SellDocumentMapper;
import com.example.marketcrm.repository.SellDocumentRepository;
import com.example.marketcrm.service.SellDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class SellDocumentServiceImpl implements SellDocumentService {
    private final SellDocumentRepository repository;
    private final SellDocumentCreateMapper createMapper;
    private final SellDocumentMapper mapper;
    @Override
    public Set<SellDocumentDTO> getAllSellDocs() {
        return mapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public SellDocumentDTO getSellDoc(Long id) {
        return mapper.toDTO(repository.getReferenceById(id));
    }

    @Override
    public SellDocumentDTO createSellDocument(SellDocumentCreateDTO createDTO) {
        return mapper.toDTO(
                repository.save(createMapper.toEntity(createDTO))
        );
    }

    @Override
    public void deleteSellDocument(Long id) {
            repository.deleteById(id);
    }
}
