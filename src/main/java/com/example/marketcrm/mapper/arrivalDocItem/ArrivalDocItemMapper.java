package com.example.marketcrm.mapper.arrivalDocItem;

import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemDTO;
import com.example.marketcrm.entity.ArrivalDocItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.arrivalDoc.ArrivalDocsWithOrgMapper;
import com.example.marketcrm.mapper.product.ProductWithCategoryMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {ArrivalDocsWithOrgMapper.class, ProductWithCategoryMapper.class})
public interface ArrivalDocItemMapper extends EntityMapper<ArrivalDocItemDTO, ArrivalDocItems> {
}
