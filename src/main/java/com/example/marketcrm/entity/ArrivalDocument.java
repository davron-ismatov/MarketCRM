package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Entity @Table(name = "arrival_documents")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArrivalDocument {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Organization organization;

    @Column(columnDefinition = "date default current_date")
    private Date doc_date;

    @Column(unique = true)
    private Integer doc_number;

    @OneToMany(mappedBy = "document")
    private Set<ArrivalDocItems> items;
}
