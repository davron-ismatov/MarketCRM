package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "store_product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Product product;

    private Double amount;

    @OneToMany(mappedBy = "product",fetch = FetchType.EAGER)
    private Set<StoreDocumentItems> items;
}
