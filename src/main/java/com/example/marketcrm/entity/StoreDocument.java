package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "store_document")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String doc_number;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date date;

    @Enumerated(EnumType.STRING)
    private DocStatus status;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "document")
    private Set<StoreDocumentItems> items;

    @PrePersist
    public void prePersist(){
        if (doc_number==null && status==null){
            doc_number = "ST_DOC_" + LocalDateTime.now();
            status = DocStatus.CREATED;
        }
    }
}
