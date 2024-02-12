package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.returnToWarehouseDoc.ReturnToWarehouseDocCreateDTO;
import com.example.marketcrm.dto.returnToWarehouseDoc.ReturnToWarehouseDocDTO;
import com.example.marketcrm.mapper.returnToWarehouseDoc.ReturnToWarehouseDocCreateMapper;
import com.example.marketcrm.mapper.returnToWarehouseDoc.ReturnToWarehouseDocMapper;
import com.example.marketcrm.repository.ReturnToWarehouseDocRepository;
import com.example.marketcrm.service.ReturnToWarehouseDocService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@RequiredArgsConstructor
public class ReturnToWarehouseDocServiceImpl implements ReturnToWarehouseDocService {
    private final ReturnToWarehouseDocMapper mapper;
    private final ReturnToWarehouseDocRepository repository;
    private final ReturnToWarehouseDocCreateMapper createMapper;

    @Override
    public Set<ReturnToWarehouseDocDTO> gerAllDocs() {
        return mapper.toDTOs(
                new HashSet<>(repository.findAll())
        );
    }

    @Override
    public ReturnToWarehouseDocDTO getDocument(Long id) {
        return mapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    @Override
    public ReturnToWarehouseDocDTO createDocs(ReturnToWarehouseDocCreateDTO createDTO) {
        return mapper.toDTO(
                repository.save(createMapper.toEntity(createDTO))
        );
    }

    @Override
    public void deleteDoc(Long id) {
            repository.deleteById(id);
    }
}
