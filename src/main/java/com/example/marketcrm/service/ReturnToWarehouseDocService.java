package com.example.marketcrm.service;

import com.example.marketcrm.dto.returnToWarehouseDoc.ReturnToWarehouseDocCreateDTO;
import com.example.marketcrm.dto.returnToWarehouseDoc.ReturnToWarehouseDocDTO;

import java.util.Set;

public interface ReturnToWarehouseDocService {
    Set<ReturnToWarehouseDocDTO> gerAllDocs();
    ReturnToWarehouseDocDTO getDocument(Long id);
    ReturnToWarehouseDocDTO createDocs(ReturnToWarehouseDocCreateDTO createDTO);

    void deleteDoc(Long id);
}
