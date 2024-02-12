package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "return_to_warehouse_document_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReturnToWarehouseDocItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private ReturnToWarehouseDoc document;

    @ManyToOne
    private StoreProduct storeProduct;

    @ManyToOne
    private Product product;

    private Double count;

}
