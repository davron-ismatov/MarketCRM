package com.example.marketcrm.repository;

import com.example.marketcrm.dto.productPrice.ProductPriceWithoutProductDTO;
import com.example.marketcrm.entity.Product;
import com.example.marketcrm.entity.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query(value = "select pp from ProductPrice pp join fetch Product p on p.id=pp.id where pp.is_actual=true ")
    Set<ProductPrice> getProductsFromProductsPrice();

    @Query(value = "select pp from ProductPrice pp join fetch Product p on p.id=pp.id where pp.is_actual=true and p.id=:id")
    ProductPrice getProductsFromProductsPriceById(@Param("id") Long id);
}
