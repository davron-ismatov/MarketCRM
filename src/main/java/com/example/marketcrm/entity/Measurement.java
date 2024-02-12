package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name = "units")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String unit_name;
}
