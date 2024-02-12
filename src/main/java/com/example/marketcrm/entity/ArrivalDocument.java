package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity @Table(name = "arrival_documents")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArrivalDocument {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Organization organization;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date doc_date;

    @Column(unique = true)
    private String  doc_number;

    @OneToMany(mappedBy = "document",fetch = FetchType.EAGER)
    private Set<ArrivalDocItems> items;

    @PrePersist
    public void prePersist() {
        if (doc_number==null) {
           doc_number = "AC_DOC_" + LocalDateTime.now();
        }
    }
}
