package com.example.marketcrm.controller;

import com.example.marketcrm.dto.income.IncomeDTO;
import com.example.marketcrm.service.IncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Set;

@RestController
@RequestMapping("/income")
@RequiredArgsConstructor
public class IncomeController  {
    private final IncomeService service;
    @GetMapping("/interval")
    public Set<IncomeDTO> getSales(@RequestBody  Date from_date,@RequestBody  Date to_date) {
        return service.getSales(from_date,to_date);
    }

    @GetMapping("/productName/interval")
    public Set<IncomeDTO> getSales(@RequestBody String product_name,@RequestBody  Date from_date,@RequestBody  Date to_date) {
        return service.getSales(product_name, from_date, to_date);
    }

    @GetMapping("/productName")
    public Set<IncomeDTO> getSales(@RequestBody String product_name) {
        return service.getSales(product_name);
    }

    @GetMapping
    public Set<IncomeDTO> getSales() {
        return service.getSales();
    }
}
