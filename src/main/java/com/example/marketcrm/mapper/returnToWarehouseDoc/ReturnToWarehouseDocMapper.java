package com.example.marketcrm.mapper.returnToWarehouseDoc;

import com.example.marketcrm.dto.returnToWarehouseDoc.ReturnToWarehouseDocDTO;
import com.example.marketcrm.entity.ReturnToWarehouseDoc;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.returnToWarehouseDocItem.ReturnToWarehouseDocItemsWithoutDocsMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {ReturnToWarehouseDocItemsWithoutDocsMapper.class})
public interface ReturnToWarehouseDocMapper extends EntityMapper<ReturnToWarehouseDocDTO,ReturnToWarehouseDoc> {
}
