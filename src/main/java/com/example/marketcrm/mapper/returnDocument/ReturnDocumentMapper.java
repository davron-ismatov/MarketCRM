package com.example.marketcrm.mapper.returnDocument;

import com.example.marketcrm.dto.returnDocument.ReturnDocumentDTO;
import com.example.marketcrm.entity.ReturnDocument;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.returnDocItem.ReturnDocItemsWithoutDocsMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",uses = {ReturnDocItemsWithoutDocsMapper.class})
public interface ReturnDocumentMapper extends EntityMapper<ReturnDocumentDTO, ReturnDocument> {
}
