package com.example.marketcrm.controller;

import com.example.marketcrm.dto.sellDocument.SellDocumentCreateDTO;
import com.example.marketcrm.dto.sellDocument.SellDocumentDTO;
import com.example.marketcrm.service.SellDocumentService;
import com.example.marketcrm.service.implementations.SellDocumentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/sell-document")
public class SellDocumentController  {
    @Autowired
    private SellDocumentServiceImpl service;

    @GetMapping
    public Set<SellDocumentDTO> getAllSellDocs() {
        return service.getAllSellDocs();
    }

    @GetMapping("/{id}")
    public SellDocumentDTO getSellDoc(@PathVariable Long id) {
        return service.getSellDoc(id);
    }

    @PostMapping
    public SellDocumentDTO createSellDocument(@RequestBody SellDocumentCreateDTO createDTO) {
        return service.createSellDocument(createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteSellDocument(@PathVariable Long id) {
        service.deleteSellDocument(id);
    }
}
