package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "store_document_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreDocumentItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private StoreDocument document;

    @ManyToOne(fetch = FetchType.EAGER)
    private StoreProduct product;

    private Double amount;
}
