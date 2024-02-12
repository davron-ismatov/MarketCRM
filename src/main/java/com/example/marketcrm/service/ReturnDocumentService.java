package com.example.marketcrm.service;

import com.example.marketcrm.dto.returnDocument.ReturnDocumentCreateDTO;
import com.example.marketcrm.dto.returnDocument.ReturnDocumentDTO;

import java.util.Set;

public interface ReturnDocumentService {
    Set<ReturnDocumentDTO> getAllDocuments();
    ReturnDocumentDTO getDocument(Long id);

    ReturnDocumentDTO createDocument(ReturnDocumentCreateDTO createDTO);
    void deleteDocument(Long id);
}
