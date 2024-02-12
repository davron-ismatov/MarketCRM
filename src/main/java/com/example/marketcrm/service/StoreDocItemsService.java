package com.example.marketcrm.service;

import com.example.marketcrm.dto.storeDocumentItem.StoreDocItemsCreateDTO;
import com.example.marketcrm.dto.storeDocumentItem.StoreDocItemsDTO;
import com.example.marketcrm.entity.StoreDocumentItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;


public interface StoreDocItemsService {
    Set<StoreDocItemsDTO> getAllItemsInStore();

    StoreDocItemsDTO getItemsInStore(Long id);

    StoreDocItemsDTO createItemInStore(StoreDocItemsCreateDTO createDTO);

    StoreDocItemsDTO updateItemInStore(Long id,StoreDocItemsCreateDTO createDTO);

    void deleteItemInStore(Long id);

}
