package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "sell_document")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SellDocument {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String doc_number;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private LocalDate date;

    @OneToMany(mappedBy = "document",cascade = CascadeType.ALL)
    private Set<SellDocumentItem> items;
    @PrePersist
    public void prePersist(){
        if (date==null){
            date = LocalDate.now();
        }
    }

}
