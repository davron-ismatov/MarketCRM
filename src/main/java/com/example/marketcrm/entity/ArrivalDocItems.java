package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity @Table(name = "arrival_doc_items")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArrivalDocItems {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double arrival_price;
    private Double count;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private ArrivalDocument document;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Product products;

}
