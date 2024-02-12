package com.example.marketcrm.dto.storeDocument;

import com.example.marketcrm.dto.storeDocumentItem.StoreDocItemsWithoutDocDTO;
import lombok.*;

import java.sql.Date;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StoreDocumentDTO {
    private Long id;
    private String doc_number;
    private Date date;
    private Set<StoreDocItemsWithoutDocDTO> items;
}
