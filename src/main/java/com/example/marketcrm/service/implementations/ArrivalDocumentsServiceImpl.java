package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.arrivalDoc.ArrivalDocDTO;
import com.example.marketcrm.dto.arrivalDoc.ArrivalDocumentCreateDTO;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.entity.Organization;
import com.example.marketcrm.mapper.arrivalDoc.ArrivalDocMapper;
import com.example.marketcrm.mapper.arrivalDoc.ArrivalDocsWithOrgMapper;
import com.example.marketcrm.mapper.arrivalDoc.ArrivalDocumentCreateMapper;
import com.example.marketcrm.mapper.arrivalDoc.ArrivalDocumentWithoutOrgMapper;
import com.example.marketcrm.repository.ArrivalDocumentRepository;
import com.example.marketcrm.repository.OrganizationRepository;
import com.example.marketcrm.service.ArrivalDocumentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ArrivalDocumentsServiceImpl implements ArrivalDocumentsService {
    private final ArrivalDocumentRepository repository;
    private final ArrivalDocMapper mapper;
    private final ArrivalDocumentCreateMapper createMapper;
    private final ArrivalDocsWithOrgMapper withOrgMapper;
    private final ArrivalDocumentWithoutOrgMapper withoutOrgMapper;
    private final OrganizationRepository organizationRepository;
    @Override
    public Set<ArrivalDocDTO> getAllDocs() {
        return mapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public ArrivalDocDTO getDoc(Long id) {
        return mapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    @Override
    public ArrivalDocDTO createDoc(ArrivalDocumentCreateDTO createDTO) {
        if (!organizationRepository.existsById(createDTO.getOrganization().getId())){
            throw new NoSuchElementException();
        }
        ArrivalDocument arrivalDocument = createMapper.toEntity(createDTO);
        arrivalDocument.setOrganization(
                organizationRepository.getReferenceById(createDTO.getOrganization().getId())
        );
        repository.save(arrivalDocument);
        return mapper.toDTO(arrivalDocument);
    }

    @Override
    public ArrivalDocDTO updateDoc(Long id, ArrivalDocumentCreateDTO createDTO) {
        if (!organizationRepository.existsById(createDTO.getOrganization().getId())){
            throw new NoSuchElementException();
        }
        ArrivalDocument document = repository.getReferenceById(id);
        document.setOrganization(
                organizationRepository.getReferenceById(createDTO.getOrganization().getId())
        );

        return mapper.toDTO(
                repository.save(document)
        );
    }

    @Override
    public void deleteDoc(Long id) {
        repository.deleteById(id);
    }
}
