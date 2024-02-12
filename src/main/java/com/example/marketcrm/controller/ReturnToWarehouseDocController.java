package com.example.marketcrm.controller;

import com.example.marketcrm.dto.returnToWarehouseDoc.ReturnToWarehouseDocCreateDTO;
import com.example.marketcrm.dto.returnToWarehouseDoc.ReturnToWarehouseDocDTO;
import com.example.marketcrm.service.ReturnToWarehouseDocService;
import com.example.marketcrm.service.implementations.ReturnToWarehouseDocServiceImpl;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/return-to-warehouse-doc")
public class ReturnToWarehouseDocController {
    @Autowired
    private ReturnToWarehouseDocServiceImpl service;

    @GetMapping
    public Set<ReturnToWarehouseDocDTO> gerAllDocs() {
        return service.gerAllDocs();
    }

    @GetMapping("/{id}")
    public ReturnToWarehouseDocDTO getDocument(@PathVariable Long id) {
        return service.getDocument(id);
    }

    @PostMapping
    public ReturnToWarehouseDocDTO createDocs(@RequestBody ReturnToWarehouseDocCreateDTO createDTO) {

        return service.createDocs(createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteDoc(@PathVariable Long id) {
        service.deleteDoc(id);
    }
}
