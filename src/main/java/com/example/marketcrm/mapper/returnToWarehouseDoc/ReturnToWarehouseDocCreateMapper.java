package com.example.marketcrm.mapper.returnToWarehouseDoc;

import com.example.marketcrm.dto.returnToWarehouseDoc.ReturnToWarehouseDocCreateDTO;
import com.example.marketcrm.entity.ReturnToWarehouseDoc;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReturnToWarehouseDocCreateMapper extends EntityMapper<ReturnToWarehouseDocCreateDTO, ReturnToWarehouseDoc> {
}
