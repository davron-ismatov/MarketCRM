package com.example.marketcrm.dto.returnDocument;


import lombok.*;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReturnDocWithoutItemsDTO {
    private Long id;
    private String doc_number;
    private Date date;
}
