package com.example.marketcrm.service;

import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemCreateDTO;
import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemDTO;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface ArrivalDocItemsService {
    Set<ArrivalDocItemDTO> getAllDocItems();
    ArrivalDocItemDTO getDocItem(Long id);
    ArrivalDocItemDTO createDocItem(ArrivalDocItemCreateDTO createDTO);

    ArrivalDocItemDTO updateDocItem(Long id,ArrivalDocItemCreateDTO createDTO);

    void deleteDocItem(Long id);
}
