package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "sell_document_item")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SellDocumentItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private SellDocument document;

    @ManyToOne
    private StoreProduct product;
    private Double count;
    private Double price;
}
