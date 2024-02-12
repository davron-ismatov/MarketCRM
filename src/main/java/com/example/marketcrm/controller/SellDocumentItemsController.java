package com.example.marketcrm.controller;

import com.example.marketcrm.dto.sellDocumentItem.SellDocumentItemsCreateDTO;
import com.example.marketcrm.dto.sellDocumentItem.SellDocumentItemsDTO;
import com.example.marketcrm.service.SellDocumentItemsService;
import com.example.marketcrm.service.implementations.SellDocumentItemsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/sell-docs-items")
public class SellDocumentItemsController  {
    @Autowired
    private SellDocumentItemsServiceImpl service;

    @GetMapping
    public Set<SellDocumentItemsDTO> getAllSellDocsItems() {
        return service.getAllSellDocsItems();
    }

    @GetMapping("/{id}")
    public SellDocumentItemsDTO getSellDocItem(@PathVariable Long id) {
        return service.getSellDocItem(id);
    }

    @PostMapping
    public SellDocumentItemsDTO createSellDocItem(@RequestBody SellDocumentItemsCreateDTO createDTO) {
        return service.createSellDocItem(createDTO);
    }

    @PutMapping("/{id}")
    public SellDocumentItemsDTO updateSellDocItem(@PathVariable Long id,@RequestBody SellDocumentItemsCreateDTO createDTO) {
        return service.updateSellDocItem(id, createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteSellDocItem(@PathVariable Long id) {
        service.deleteSellDocItem(id);
    }
}
