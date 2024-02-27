package com.example.marketcrm.dto.income;

import lombok.*;

import java.util.Objects;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IncomeDTO {
    private String product_name;
    private Double total_sales;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IncomeDTO dto = (IncomeDTO) o;
        return Objects.equals(product_name, dto.product_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_name);
    }
}
