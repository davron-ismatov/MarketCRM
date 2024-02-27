package com.example.marketcrm.service.implementations;

import com.example.marketcrm.dto.income.IncomeDTO;
import com.example.marketcrm.entity.SellDocumentItem;
import com.example.marketcrm.repository.SellDocumentItemsRepository;
import com.example.marketcrm.repository.StoreProductRepository;
import com.example.marketcrm.service.IncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class IncomeServiceImpl implements IncomeService {
    private final SellDocumentItemsRepository repository;
    private final StoreProductRepository productRepository;
    @Override
    public Set<IncomeDTO> getSales(Date from_date, Date to_date) {
        HashSet<IncomeDTO> dtos = new HashSet<>();

        List<SellDocumentItem> items = repository.getSales(from_date,to_date);
        items.stream()
                .filter(
                        x ->dtos.add(IncomeDTO.builder().product_name(x.getProduct().getProduct().getProduct_name()).build())
                )
                .peek(x ->{

                        dtos.remove(
                                IncomeDTO.builder().product_name(x.getProduct().getProduct().getProduct_name()).build()
                        );

                      IncomeDTO dto =  toDTO(
                                x,calculateTotalAmount(new HashSet<>(items),x.getProduct().getProduct().getProduct_name())
                        );

                      dtos.add(dto);
                }).collect(Collectors.toSet());
        return dtos;
    }

    @Override
    public Set<IncomeDTO> getSales(String product_name, Date from_date, Date to_date) {
        if (productRepository.existsByProductProduct_name(product_name)){
            throw new NoSuchElementException("No such product in store");
        }
        HashSet<IncomeDTO> dtos = new HashSet<>();

        List<SellDocumentItem> items = repository.getSales(product_name,from_date,to_date);
        items.stream()
                .filter(
                        x ->dtos.add(IncomeDTO.builder().product_name(x.getProduct().getProduct().getProduct_name()).build())
                )
                .peek(x ->{

                    dtos.remove(
                            IncomeDTO.builder().product_name(x.getProduct().getProduct().getProduct_name()).build()
                    );

                    IncomeDTO dto =  toDTO(
                            x,calculateTotalAmount(new HashSet<>(items),x.getProduct().getProduct().getProduct_name())
                    );

                    dtos.add(dto);
                }).collect(Collectors.toSet());
        return dtos;
    }

    @Override
    public Set<IncomeDTO> getSales(String product_name) {
        if (productRepository.existsByProductProduct_name(product_name)){
            throw new NoSuchElementException("No such product in store");
        }
        HashSet<IncomeDTO> dtos = new HashSet<>();

        List<SellDocumentItem> items = repository.getSales(product_name);
        items.stream()
                .filter(
                        x ->dtos.add(IncomeDTO.builder().product_name(x.getProduct().getProduct().getProduct_name()).build())
                )
                .peek(x ->{

                    dtos.remove(
                            IncomeDTO.builder().product_name(x.getProduct().getProduct().getProduct_name()).build()
                    );

                    IncomeDTO dto =  toDTO(
                            x,calculateTotalAmount(new HashSet<>(items),x.getProduct().getProduct().getProduct_name())
                    );

                    dtos.add(dto);
                }).collect(Collectors.toSet());
        return dtos;
    }

    @Override
    public Set<IncomeDTO> getSales() {
        HashSet<IncomeDTO> dtos = new HashSet<>();

        List<SellDocumentItem> items = repository.getSales();
        items.stream()
                .filter(
                        x ->dtos.add(IncomeDTO.builder().product_name(x.getProduct().getProduct().getProduct_name()).build())
                )
                .peek(x ->{

                    dtos.remove(
                            IncomeDTO.builder().product_name(x.getProduct().getProduct().getProduct_name()).build()
                    );

                    IncomeDTO dto =  toDTO(
                            x,calculateTotalAmount(new HashSet<>(items),x.getProduct().getProduct().getProduct_name())
                    );

                    dtos.add(dto);
                }).collect(Collectors.toSet());
        return dtos;
    }

    public IncomeDTO toDTO(SellDocumentItem item,Double total_amount){
        return IncomeDTO.builder()
                .product_name(item.getProduct().getProduct().getProduct_name())
                .total_sales(total_amount)
                .build();
    }

    public Double calculateTotalAmount(Set<SellDocumentItem> items,String productName){
        AtomicReference<Double> total_amount = new AtomicReference<>(0.0);
        items.stream()
                .filter(x -> x.getProduct().getProduct().getProduct_name().equalsIgnoreCase(productName))
                .peek(x ->{
                   total_amount.set(total_amount.get()+(x.getCount()*x.getPrice()));
                }).collect(Collectors.toSet());
        return total_amount.get();
    }
}
