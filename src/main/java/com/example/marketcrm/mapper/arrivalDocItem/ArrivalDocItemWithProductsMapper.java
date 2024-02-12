package com.example.marketcrm.mapper.arrivalDocItem;

import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemWithProductsDTO;
import com.example.marketcrm.entity.ArrivalDocItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.arrivalDoc.ArrivalDocsWithOrgMapper;
import com.example.marketcrm.mapper.product.ProductWithCategoryMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = { ProductWithCategoryMapper.class})
public abstract class ArrivalDocItemWithProductsMapper implements EntityMapper<ArrivalDocItemWithProductsDTO, ArrivalDocItems> {

    @Override
    @Mapping(ignore = true,target = "document")
    public abstract ArrivalDocItems toEntity(ArrivalDocItemWithProductsDTO dto);
}
