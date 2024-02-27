package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.returnDocument.ReturnDocumentCreateDTO;
import com.example.marketcrm.dto.returnDocument.ReturnDocumentDTO;
import com.example.marketcrm.entity.DocStatus;
import com.example.marketcrm.mapper.returnDocument.ReturnDocCreateMapper;
import com.example.marketcrm.mapper.returnDocument.ReturnDocumentMapper;
import com.example.marketcrm.repository.ReturnDocRepository;
import com.example.marketcrm.service.ReturnDocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ReturnDocumentServiceImpl implements ReturnDocumentService {
    private final ReturnDocRepository repository;
    private final ReturnDocumentMapper mapper;
    private final ReturnDocCreateMapper createMapper;
    @Override
    public Set<ReturnDocumentDTO> getAllDocuments() {
        return mapper.toDTOs(
               repository.findArrivalDocumentByStatus(DocStatus.DONE)
        );
    }

    @Override
    public ReturnDocumentDTO getDocument(Long id) {
        return mapper.toDTO(
                repository.findArrivalDocumentByStatusAndId(DocStatus.DONE,id)
        );
    }

    @Override
    public ReturnDocumentDTO createDocument(ReturnDocumentCreateDTO createDTO) {
        return mapper.toDTO(repository.save(
                createMapper.toEntity(createDTO)
        )
        );
    }

    @Override
    public void deleteDocument(Long id) {
        repository.deleteById(id);
    }
}
