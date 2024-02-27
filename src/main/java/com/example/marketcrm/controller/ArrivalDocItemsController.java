package com.example.marketcrm.controller;

import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemCreateDTO;
import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemDTO;
import com.example.marketcrm.service.ArrivalDocItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/arrival-doc-item")
@RequiredArgsConstructor
public class ArrivalDocItemsController {

    private final ArrivalDocItemsService service;
    @GetMapping
    public Set<ArrivalDocItemDTO> getAllDocItems() {
        return service.getAllDocItems();
    }

    @GetMapping("/{id}")
    public ArrivalDocItemDTO getDocItem(@PathVariable Long id) {
        return service.getDocItem(id);
    }

    @PostMapping
    public ArrivalDocItemDTO createDocItem(@RequestBody ArrivalDocItemCreateDTO createDTO) {
        return service.createDocItem(createDTO);
    }

    @PutMapping("/{id}")
    public ArrivalDocItemDTO updateDocItem(@PathVariable Long id,@RequestBody ArrivalDocItemCreateDTO createDTO) {
        return service.updateDocItem(id, createDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteDocItem(@PathVariable Long id) {
        service.deleteDocItem(id);
    }
}
