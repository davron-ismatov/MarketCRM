package com.example.marketcrm;

import com.example.marketcrm.dto.income.IncomeDTO;
import com.example.marketcrm.entity.SellDocumentItem;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class MarketCrmApplicationTests {

    @Test
    void contextLoads() {
        HashSet<IncomeDTO> items = new HashSet<>();
        items.add(IncomeDTO.builder()
                        .product_name("non")
                .build());
        items.add(IncomeDTO.builder()
                .product_name("non")
                .build());
        items.remove(IncomeDTO.builder()
                .product_name("non")
                .build());
        items.add(IncomeDTO.builder()
                .product_name("non")
                .build());
        items.forEach(System.out::println);
        System.out.println("chiqdi");
    }

}
