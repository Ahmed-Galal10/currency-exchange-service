package com.microservices.currencyexchangeservice.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum Currency {
    USD, EUR, AED, EGP;

    private String currency;

    Currency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }
}
