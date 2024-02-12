package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity @Table(name = "organizations")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String organization_name;
    private String address;
    private String tellNum;
    private String description;

    @OneToMany(mappedBy = "organization",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Set<ArrivalDocument> documents;
}
