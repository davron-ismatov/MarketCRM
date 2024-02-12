package com.example.marketcrm.controller;

import com.example.marketcrm.dto.storeDocumentItem.StoreDocItemsCreateDTO;
import com.example.marketcrm.dto.storeDocumentItem.StoreDocItemsDTO;
import com.example.marketcrm.service.StoreDocItemsService;
import com.example.marketcrm.service.implementations.StoreDocumentItemsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/store-doc-item")
@RequiredArgsConstructor
public class StoreDocItemController {
    private final StoreDocumentItemsServiceImpl service;
    @GetMapping
    public Set<StoreDocItemsDTO> getAllItemsInStore() {
        return service.getAllItemsInStore();
    }

    @GetMapping("/{id}")
    public StoreDocItemsDTO getItemsInStore(@PathVariable Long id) {
        return service.getItemsInStore(id);
    }

    @PostMapping
    public StoreDocItemsDTO createItemInStore(@RequestBody StoreDocItemsCreateDTO createDTO) {
        return service.createItemInStore(createDTO);
    }

    @PutMapping("/{id}")
    public StoreDocItemsDTO updateItemInStore(@PathVariable Long id,@RequestBody StoreDocItemsCreateDTO createDTO) {
        return service.updateItemInStore(id,createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteItemInStore(@PathVariable Long id) {
        service.deleteItemInStore(id);
    }
}
