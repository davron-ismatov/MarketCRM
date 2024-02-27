package com.example.marketcrm.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "return_to_warehouse_document")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReturnToWarehouseDoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String doc_number;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date date;

    @Enumerated(EnumType.STRING)
    private DocStatus status;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "document")
    private Set<ReturnToWarehouseDocItems> items;
    @PrePersist
    public void prePersist(){
        if (doc_number==null && status==null){
            doc_number = "RTW_DOC_" + LocalDate.now();
            status = DocStatus.CREATED;
        }
    }
}
