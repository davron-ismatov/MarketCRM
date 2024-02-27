package com.example.marketcrm.repository;

import com.example.marketcrm.entity.SellDocumentItem;
import org.mapstruct.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface SellDocumentItemsRepository extends JpaRepository<SellDocumentItem,Long> {
    @Query(value = "select sdi from SellDocumentItem sdi inner join SellDocument sd on sdi.document.id=sd.id where sd.date between :from_date and :to_date")
    List<SellDocumentItem> getSales(Date from_date,Date to_date);

    @Query(value = "select sdi from SellDocumentItem sdi inner join SellDocument sd on sdi.document.id=sd.id inner join StoreProduct sp on sdi.product.id = sp.id inner join Product p on sp.product.id = p.id where sd.date between :from_date and :to_date and p.product_name=:product_name")
    List<SellDocumentItem> getSales(String product_name,Date from_date,Date to_date);

    @Query(value = "select sdi from SellDocumentItem sdi inner join SellDocument sd on sdi.document.id=sd.id inner join StoreProduct sp on sdi.product.id = sp.id inner join Product p on sp.product.id = p.id  where sd.date = local_date and p.product_name=:product_name")
    List<SellDocumentItem> getSales(String product_name);
    @Query(value = "select sdi from SellDocumentItem sdi inner join SellDocument sd on sdi.document.id=sd.id where sd.date = local_date")
    List<SellDocumentItem> getSales();
}
