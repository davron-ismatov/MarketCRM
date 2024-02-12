package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "return_doc_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReturnDocItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private ReturnDocument document;

    @ManyToOne
    private StoreProduct product;

    private Double count;
}
