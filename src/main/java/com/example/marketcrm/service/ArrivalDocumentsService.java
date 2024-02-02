package com.example.marketcrm.service;

import com.example.marketcrm.dto.arrivalDoc.ArrivalDocDTO;
import com.example.marketcrm.dto.arrivalDoc.ArrivalDocumentCreateDTO;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface ArrivalDocumentsService {
    Set<ArrivalDocDTO> getAllDocs();
    ArrivalDocDTO getDoc(Long id);
    ArrivalDocDTO createDoc(ArrivalDocumentCreateDTO createDTO);

    ArrivalDocDTO updateDoc(Long id,ArrivalDocumentCreateDTO createDTO);
    void deleteDoc(Long id);
}
