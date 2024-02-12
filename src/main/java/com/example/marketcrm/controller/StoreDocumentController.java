package com.example.marketcrm.controller;

import com.example.marketcrm.dto.storeDocument.StoreDocumentCreateDTO;
import com.example.marketcrm.dto.storeDocument.StoreDocumentDTO;
import com.example.marketcrm.service.StoreDocumentService;
import com.example.marketcrm.service.implementations.StoreDocumentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/store-doc")
@RequiredArgsConstructor
public class StoreDocumentController  {
    private final StoreDocumentServiceImpl service;
    @GetMapping
    public Set<StoreDocumentDTO> getAllStoreDocs() {
        return service.getAllStoreDocs();
    }

    @GetMapping("/{id}")
    public StoreDocumentDTO getStoreDocument(@PathVariable Long id) {
        return service.getStoreDocument(id);
    }

    @PostMapping
    public StoreDocumentDTO createStoreDoc(@RequestBody StoreDocumentCreateDTO createDTO) {
        return service.createStoreDoc(createDTO);
    }

    @PutMapping("/{id}")
    public StoreDocumentDTO updateStoreDoc(@PathVariable Long id,@RequestBody StoreDocumentCreateDTO createDTO) {
        return service.updateStoreDoc(id,createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteStoreDoc(@PathVariable Long id) {
        service.deleteStoreDoc(id);
    }
}
