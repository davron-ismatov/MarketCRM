package com.example.marketcrm.controller;

import com.example.marketcrm.dto.returnToWarehouseDocItems.ReturnToWarehouseDocItemsCreateDTO;
import com.example.marketcrm.dto.returnToWarehouseDocItems.ReturnToWarehouseDocItemsDTO;
import com.example.marketcrm.service.ReturnToWarehouseDocItemService;
import com.example.marketcrm.service.implementations.ReturnToWarehouseDocItemsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("return-to-warehouse-doc-items")

public class ReturnToWarehouseDocItemsController {
    @Autowired
    private ReturnToWarehouseDocItemsServiceImpl service;

    @GetMapping
    public Set<ReturnToWarehouseDocItemsDTO> getAllItems() {
        return service.getAllItems();
    }

    @GetMapping("/{id}")
    public ReturnToWarehouseDocItemsDTO getItem(@PathVariable Long id) {
        return service.getItem(id);
    }

    @PostMapping
    public ReturnToWarehouseDocItemsDTO createItem(@RequestBody ReturnToWarehouseDocItemsCreateDTO createDTO) {
        return service.createItem(createDTO);
    }

    @PutMapping("/{id}")
    public ReturnToWarehouseDocItemsDTO updateItem(@PathVariable Long id,@RequestBody ReturnToWarehouseDocItemsCreateDTO createDTO) {
        return service.updateItem(id,createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        service.deleteItem(id);
    }
}
