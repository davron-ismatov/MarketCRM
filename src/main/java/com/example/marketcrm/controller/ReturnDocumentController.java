package com.example.marketcrm.controller;

import com.example.marketcrm.dto.returnDocument.ReturnDocumentCreateDTO;
import com.example.marketcrm.dto.returnDocument.ReturnDocumentDTO;
import com.example.marketcrm.service.ReturnDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/return-document")
public class ReturnDocumentController {

    private final ReturnDocumentService service;
    @Autowired
    public ReturnDocumentController(ReturnDocumentService service) {
        this.service = service;
    }

    @GetMapping
    public Set<ReturnDocumentDTO> getAllDocuments() {
        return service.getAllDocuments();
    }

    @GetMapping("/{id}")
    public ReturnDocumentDTO getDocument(@PathVariable Long id) {
        return service.getDocument(id);
    }

    @PostMapping
    public ReturnDocumentDTO createDocument(@RequestBody ReturnDocumentCreateDTO createDTO) {
        return service.createDocument(createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteDocument(@PathVariable Long id) {
        service.deleteDocument(id);
    }
}
