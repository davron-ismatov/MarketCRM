package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "return_document")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReturnDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String doc_number;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "document")
    private Set<ReturnDocItems> items;
    @PrePersist
    public void prePersist(){
        if (doc_number==null){
            doc_number = "RT_DOC_" + LocalDate.now();
        }
    }
}
