package com.example.marketcrm.service;

import com.example.marketcrm.dto.returnToWarehouseDocItems.ReturnToWarehouseDocItemsCreateDTO;
import com.example.marketcrm.dto.returnToWarehouseDocItems.ReturnToWarehouseDocItemsDTO;

import java.util.Set;

public interface ReturnToWarehouseDocItemService {
    Set<ReturnToWarehouseDocItemsDTO> getAllItems();
    ReturnToWarehouseDocItemsDTO getItem(Long id);
    ReturnToWarehouseDocItemsDTO createItem(ReturnToWarehouseDocItemsCreateDTO createDTO);

    ReturnToWarehouseDocItemsDTO updateItem(Long id,ReturnToWarehouseDocItemsCreateDTO createDTO);

    void deleteItem(Long id);
}
