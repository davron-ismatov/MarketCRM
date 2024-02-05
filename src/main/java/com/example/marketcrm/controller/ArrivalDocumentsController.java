package com.example.marketcrm.controller;

import com.example.marketcrm.dto.arrivalDoc.ArrivalDocDTO;
import com.example.marketcrm.dto.arrivalDoc.ArrivalDocumentCreateDTO;
import com.example.marketcrm.service.ArrivalDocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/arrival-document")
public class ArrivalDocumentsController  {
    @Autowired
    private ArrivalDocumentsService service;
    @GetMapping
    public Set<ArrivalDocDTO> getAllDocs() {
        return service.getAllDocs();
    }

    @GetMapping("/{id}")
    public ArrivalDocDTO getDoc(@PathVariable Long id) {
        return service.getDoc(id);
    }

    @PostMapping
    public ArrivalDocDTO createDoc(@RequestBody ArrivalDocumentCreateDTO createDTO) {
        return service.createDoc(createDTO);
    }

    @PutMapping("/{id}")
    public ArrivalDocDTO updateDoc(@PathVariable Long id,@RequestBody ArrivalDocumentCreateDTO createDTO) {
        return service.updateDoc(id, createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteDoc(@PathVariable Long id) {
        service.deleteDoc(id);
    }
}
