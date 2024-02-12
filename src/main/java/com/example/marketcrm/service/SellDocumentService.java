package com.example.marketcrm.service;

import com.example.marketcrm.dto.sellDocument.SellDocumentCreateDTO;
import com.example.marketcrm.dto.sellDocument.SellDocumentDTO;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface SellDocumentService {
    Set<SellDocumentDTO> getAllSellDocs();

    SellDocumentDTO getSellDoc(Long id);

    SellDocumentDTO createSellDocument(SellDocumentCreateDTO createDTO);

    void deleteSellDocument(Long id);
}
