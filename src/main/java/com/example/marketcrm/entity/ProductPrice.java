package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity @Table(name = "products_price")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;

    private Double price;

   @CreationTimestamp
   @Temporal(TemporalType.DATE)
    private Date date;

    @Column( columnDefinition = "boolean default true",nullable = false)
    private Boolean is_actual;
}
