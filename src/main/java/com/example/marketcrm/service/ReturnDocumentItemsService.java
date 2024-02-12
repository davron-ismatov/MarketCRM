package com.example.marketcrm.service;

import com.example.marketcrm.dto.returnDocItems.ReturnDocItemsCreateDTO;
import com.example.marketcrm.dto.returnDocItems.ReturnDocItemsDTO;

import java.util.Set;

public interface ReturnDocumentItemsService {

    Set<ReturnDocItemsDTO> getAllItems();

    ReturnDocItemsDTO getItem(Long id);

    ReturnDocItemsDTO createItem(ReturnDocItemsCreateDTO createDTO);
    ReturnDocItemsDTO updateItem(Long id,ReturnDocItemsCreateDTO createDTO);

    void deleteItem(Long id);
}
