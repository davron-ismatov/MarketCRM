package com.example.marketcrm.controller;

import com.example.marketcrm.dto.returnDocItems.ReturnDocItemsCreateDTO;
import com.example.marketcrm.dto.returnDocItems.ReturnDocItemsDTO;
import com.example.marketcrm.service.ReturnDocumentItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/return-doc-items")
public class ReturnDocItemsController{
    private final ReturnDocumentItemsService service;

    @Autowired
    public ReturnDocItemsController(ReturnDocumentItemsService service) {
        this.service = service;
    }

    @GetMapping
    public Set<ReturnDocItemsDTO> getAllItems() {
        return service.getAllItems();
    }

    @GetMapping("/{id}")
    public ReturnDocItemsDTO getItem(@PathVariable Long id) {
        return service.getItem(id);
    }

    @PostMapping
    public ReturnDocItemsDTO createItem(@RequestBody ReturnDocItemsCreateDTO createDTO) {
        return service.createItem(createDTO);
    }

    @PutMapping("/{id}")
    public ReturnDocItemsDTO updateItem(@PathVariable Long id,@RequestBody ReturnDocItemsCreateDTO createDTO) {
        return service.updateItem(id,createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        service.deleteItem(id);
    }
}
