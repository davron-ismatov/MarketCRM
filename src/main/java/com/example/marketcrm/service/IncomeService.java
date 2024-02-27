package com.example.marketcrm.service;

import com.example.marketcrm.dto.income.IncomeDTO;

import java.sql.Date;
import java.util.Set;

public interface IncomeService {

    Set<IncomeDTO> getSales(Date from_date, Date to_date);
    Set<IncomeDTO> getSales(String product_name, Date from_date, Date to_date);
    Set<IncomeDTO> getSales(String product_name);
    Set<IncomeDTO> getSales();

}
