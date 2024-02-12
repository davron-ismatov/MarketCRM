package com.example.marketcrm.mapper.returnDocument;

import com.example.marketcrm.dto.returnDocument.ReturnDocumentCreateDTO;
import com.example.marketcrm.entity.ReturnDocument;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReturnDocCreateMapper extends EntityMapper<ReturnDocumentCreateDTO, ReturnDocument> {

}
