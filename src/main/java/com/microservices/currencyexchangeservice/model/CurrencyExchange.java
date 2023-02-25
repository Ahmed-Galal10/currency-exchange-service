package com.microservices.currencyexchangeservice.model;

import com.microservices.currencyexchangeservice.enums.Currency;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CurrencyExchange {
    @Id
    private Long id;
    private Currency givenCurrency;
    private Currency targetCurrency;
    private BigDecimal conversionMultiple;
    @Transient
    private String environment;

    public CurrencyExchange(Long id, Currency givenCurrency, Currency targetCurrency, BigDecimal conversionMultiple) {
        this.id = id;
        this.givenCurrency = givenCurrency;
        this.targetCurrency = targetCurrency;
        this.conversionMultiple = conversionMultiple;
    }
}
