package com.ahmete.busbuscard.dto.request;

import com.ahmete.busbuscard.utility.enums.ETransactionType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class MoneyTransactionDto {
    @NotNull
    Long amount;
    @NotNull
    String uuid;

}