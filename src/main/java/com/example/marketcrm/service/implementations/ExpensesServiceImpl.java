package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.expences.ExpensesDTO;
import com.example.marketcrm.entity.ArrivalDocItems;
import com.example.marketcrm.entity.ArrivalDocument;
import com.example.marketcrm.entity.DocStatus;
import com.example.marketcrm.mapper.organization.OrganizationWithoutDocsMapper;
import com.example.marketcrm.repository.ArrivalDocumentRepository;
import com.example.marketcrm.repository.OrganizationRepository;
import com.example.marketcrm.service.ExpensesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExpensesServiceImpl implements ExpensesService {
    private final OrganizationRepository organizationRepository;
    private final ArrivalDocumentRepository documentRepository;
    private final OrganizationWithoutDocsMapper organizationWithoutDocsMapper;
    @Override
    public List<ExpensesDTO> getExpenses(String org_name, Date from_date, Date to_date) {
        if (!organizationRepository.existsByNameIgnoreCase(org_name)){
            throw new NoSuchElementException();
        }
        List<ExpensesDTO> dtos = documentRepository.getDocForExpenses(org_name,from_date,to_date, DocStatus.DONE.name())
                .stream()
                .map(this::toDTO)
                .toList();
        return dtos;
    }

    @Override
    public List<ExpensesDTO> getExpenses(Date from_date, Date to_date) {
        List<ExpensesDTO> dtos = documentRepository.getDocForExpenses(from_date,to_date, DocStatus.DONE.name())
                .stream()
                .map(this::toDTO)
                .toList();
        return dtos;
    }

    @Override
    public List<ExpensesDTO> getExpenses(String org_name) {
        List<ExpensesDTO> dtos = documentRepository.getDocForExpenses(org_name,DocStatus.DONE.name())
                .stream()
                .map(this::toDTO)
                .toList();
        return dtos;
    }

    @Override
    public ExpensesDTO toDTO(ArrivalDocument document) {
        ExpensesDTO dto = new ExpensesDTO();
        dto.setOrganization(organizationWithoutDocsMapper.toDTO(
                document.getOrganization())
        );
        dto.setDate(document.getDoc_date());
        dto.setAmount(
                calculateTotalAmount(document.getItems())
        );
        return dto;
    }

    public Double calculateTotalAmount(Set<ArrivalDocItems> items){
        AtomicReference<Double> total_amount = new AtomicReference<>(0.0);
        items.stream()
                .peek(x -> {
                    total_amount.set(total_amount.get() + x.getArrival_price() * x.getCount());
                })
                .collect(Collectors.toSet());
        return total_amount.get();
    }
}
