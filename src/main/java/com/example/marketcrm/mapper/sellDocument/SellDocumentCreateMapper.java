package com.example.marketcrm.mapper.sellDocument;

import com.example.marketcrm.dto.sellDocument.SellDocumentCreateDTO;
import com.example.marketcrm.entity.SellDocument;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SellDocumentCreateMapper extends EntityMapper<SellDocumentCreateDTO, SellDocument> {

}
