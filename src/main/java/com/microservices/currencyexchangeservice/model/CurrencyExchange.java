package com.microservices.currencyexchangeservice.model;

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
    private String givenCurrency;
    private String targetCurrency;
    private BigDecimal conversionMultiple;
    @Transient
    private String environment;

    public CurrencyExchange(Long id, String givenCurrency, String targetCurrency, BigDecimal conversionMultiple) {
        this.id = id;
        this.givenCurrency = givenCurrency;
        this.targetCurrency = targetCurrency;
        this.conversionMultiple = conversionMultiple;
    }
}
