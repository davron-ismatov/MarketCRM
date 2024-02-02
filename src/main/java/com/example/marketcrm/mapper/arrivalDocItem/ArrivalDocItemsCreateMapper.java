package com.example.marketcrm.mapper.arrivalDocItem;


import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemCreateDTO;
import com.example.marketcrm.entity.ArrivalDocItems;
import com.example.marketcrm.mapper.EntityMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ArrivalDocItemsCreateMapper extends EntityMapper<ArrivalDocItemCreateDTO, ArrivalDocItems> {
}
