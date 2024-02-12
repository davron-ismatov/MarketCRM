package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;

@Entity @Table(name = "products_price")
@Getter
@Setter
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

    @Column(nullable = false)
    private Boolean is_actual;

    @PrePersist
    public void prePersist() {
        if (is_actual == null) {
            is_actual = true;
        }
    }
}
