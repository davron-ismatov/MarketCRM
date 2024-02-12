package com.example.marketcrm.mapper.arrivalDocItem;


import com.example.marketcrm.dto.arrivalDocItem.ArrivalDocItemCreateDTO;
import com.example.marketcrm.entity.ArrivalDocItems;
import com.example.marketcrm.mapper.EntityMapper;
import com.example.marketcrm.mapper.arrivalDoc.ArrivalDocsWithOrgMapper;
import com.example.marketcrm.mapper.arrivalDoc.ArrivalDocumentCreateMapper;
import com.example.marketcrm.mapper.product.ProductWithCategoryMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",uses = {ArrivalDocumentCreateMapper.class, ProductWithCategoryMapper.class})
public abstract class ArrivalDocItemsCreateMapper implements EntityMapper<ArrivalDocItemCreateDTO, ArrivalDocItems> {

    @Override
    @Mapping(ignore = true,target = "id")
    public abstract ArrivalDocItems toEntity(ArrivalDocItemCreateDTO dto);
}
