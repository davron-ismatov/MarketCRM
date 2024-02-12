package com.example.marketcrm.mapper.sellDocument;

import com.example.marketcrm.dto.sellDocument.SellDocumentDTO;
import com.example.marketcrm.entity.SellDocument;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.sellDocumentItems.SellDocumentItemsWithoutDocsMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {SellDocumentItemsWithoutDocsMapper.class})
public interface SellDocumentMapper extends EntityMapper<SellDocumentDTO, SellDocument> {
}
