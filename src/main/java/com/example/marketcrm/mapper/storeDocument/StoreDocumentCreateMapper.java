package com.example.marketcrm.mapper.storeDocument;

import com.example.marketcrm.dto.storeDocument.StoreDocumentCreateDTO;
import com.example.marketcrm.entity.StoreDocument;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StoreDocumentCreateMapper extends EntityMapper<StoreDocumentCreateDTO, StoreDocument> {
}
