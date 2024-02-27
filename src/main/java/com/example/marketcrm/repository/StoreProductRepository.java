package com.example.marketcrm.repository;

import com.example.marketcrm.entity.StoreProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreProductRepository extends JpaRepository<StoreProduct,Long> {

    @Query("SELECT CASE WHEN COUNT(sp) > 0 THEN true ELSE false END FROM StoreProduct sp inner join Product p on sp.product.id = p.id WHERE p.product_name = :productName")
    boolean existsByProductProduct_name(@Param("productName") String name);
}
