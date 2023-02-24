package com.microservices.currencyexchangeservice.model;

import com.microservices.currencyexchangeservice.enums.Currency;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyExchange {
    private Long id;
    private Currency givenCurrency;
    private Currency targetCurrency;
    private BigDecimal conversionMultiple;
}
