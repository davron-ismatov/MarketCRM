package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.arrivalDoc.ArrivalDocDTO;
import com.example.marketcrm.dto.arrivalDoc.ArrivalDocumentCreateDTO;
import com.example.marketcrm.service.ArrivalDocumentsService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ArrivalDocumentsServiceImpl implements ArrivalDocumentsService {
    @Override
    public Set<ArrivalDocDTO> getAllDocs() {
        return null;
    }

    @Override
    public ArrivalDocDTO getDoc(Long id) {
        return null;
    }

    @Override
    public ArrivalDocDTO createDoc(ArrivalDocumentCreateDTO createDTO) {
        return null;
    }

    @Override
    public ArrivalDocDTO updateDoc(Long id, ArrivalDocumentCreateDTO createDTO) {
        return null;
    }

    @Override
    public void deleteDoc(Long id) {

    }
}
