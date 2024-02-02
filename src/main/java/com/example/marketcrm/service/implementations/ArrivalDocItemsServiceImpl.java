package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemCreateDTO;
import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemDTO;
import com.example.marketcrm.service.ArrivalDocItemsService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ArrivalDocItemsServiceImpl implements ArrivalDocItemsService {
    @Override
    public Set<ArrivalDocItemDTO> getAllDocItems() {
        return null;
    }

    @Override
    public ArrivalDocItemDTO getDocItem(Long id) {
        return null;
    }

    @Override
    public ArrivalDocItemDTO createDocItem(ArrivalDocItemCreateDTO createDTO) {
        return null;
    }

    @Override
    public ArrivalDocItemDTO updateDocItem(Long id, ArrivalDocItemCreateDTO createDTO) {
        return null;
    }

    @Override
    public void deleteDocItem(Long id) {

    }
}
