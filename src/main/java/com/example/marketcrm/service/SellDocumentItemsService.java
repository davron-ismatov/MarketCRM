package com.example.marketcrm.service;

import com.example.marketcrm.dto.sellDocumentItem.SellDocumentItemsCreateDTO;
import com.example.marketcrm.dto.sellDocumentItem.SellDocumentItemsDTO;

import java.util.Set;

public interface SellDocumentItemsService {
    Set<SellDocumentItemsDTO> getAllSellDocsItems();

    SellDocumentItemsDTO getSellDocItem(Long id);

    SellDocumentItemsDTO createSellDocItem(SellDocumentItemsCreateDTO createDTO);

    SellDocumentItemsDTO updateSellDocItem(Long id,SellDocumentItemsCreateDTO createDTO);
    void deleteSellDocItem(Long id);
}
