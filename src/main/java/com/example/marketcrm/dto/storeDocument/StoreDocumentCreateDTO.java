package com.example.marketcrm.dto.storeDocument;

import com.example.marketcrm.entity.StoreDocumentItems;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Date;
import java.util.Set;

@Builder
@Getter
@Setter
@NoArgsConstructor
public class StoreDocumentCreateDTO {
}
