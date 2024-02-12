package com.example.marketcrm.mapper.storeDocument;

import com.example.marketcrm.dto.storeDocument.StoreDocumentDTO;
import com.example.marketcrm.entity.StoreDocument;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.storeDocItem.StoreDocItemsWithoutDocMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {StoreDocItemsWithoutDocMapper.class})
public interface StoreDocumentMapper  extends EntityMapper<StoreDocumentDTO, StoreDocument> {
}
