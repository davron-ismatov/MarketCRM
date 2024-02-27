package com.example.marketcrm.service;

import com.example.marketcrm.dto.expences.ExpensesDTO;
import com.example.marketcrm.entity.ArrivalDocument;

import java.sql.Date;
import java.util.List;

public interface ExpensesService {
    List<ExpensesDTO> getExpenses(String org_name, Date from_date,Date to_date);

    List<ExpensesDTO> getExpenses( Date from_date,Date to_date);
    List<ExpensesDTO> getExpenses( String  org_name);
    ExpensesDTO toDTO(ArrivalDocument document);

}
