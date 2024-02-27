package com.example.marketcrm.controller;

import com.example.marketcrm.dto.expences.ExpensesDTO;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.service.ExpensesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/expenses")
@RequiredArgsConstructor
public class ExpensesController  {
    private final ExpensesService service;

    @GetMapping()
    public List<ExpensesDTO> getExpenses(@RequestBody String org_name,@RequestBody Date from_date,@RequestBody Date to_date) {
        return service.getExpenses(org_name, from_date, to_date);
    }

    @GetMapping("/orgName")
    public List<ExpensesDTO> getExpenses(@RequestBody String org_name) {
        return service.getExpenses(org_name);
    }

    @GetMapping("/interval")
    public List<ExpensesDTO> getExpenses(@RequestBody Date from_date,@RequestBody Date to_date) {
        return service.getExpenses(from_date, to_date);
    }


}
