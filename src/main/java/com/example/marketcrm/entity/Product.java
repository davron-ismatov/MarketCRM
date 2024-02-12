package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity @Table(name = "products")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product_name;
    private Float amount;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Category category;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "product",fetch = FetchType.EAGER)
    private Set<ProductPrice> price;

    @ManyToOne(cascade = CascadeType.ALL)
    private Measurement unit;
}
