package com.example.marketcrm.service;

import com.example.marketcrm.dto.storeDocument.StoreDocumentCreateDTO;
import com.example.marketcrm.dto.storeDocument.StoreDocumentDTO;
import com.example.marketcrm.entity.StoreDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

public interface StoreDocumentService  {
    Set<StoreDocumentDTO> getAllStoreDocs();

    StoreDocumentDTO getStoreDocument(Long id);

    StoreDocumentDTO createStoreDoc(StoreDocumentCreateDTO createDTO);

    StoreDocumentDTO updateStoreDoc(Long id,StoreDocumentCreateDTO createDTO);

    void deleteStoreDoc(Long id);
}
