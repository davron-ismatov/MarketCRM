package com.example.marketcrm.mapper.arrivalDocItem;

import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemDTO;
import com.example.marketcrm.entity.ArrivalDocItems;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArrivalDocItemMapper extends EntityMapper<ArrivalDocItemDTO, ArrivalDocItems> {
}
