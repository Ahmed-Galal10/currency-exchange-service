package com.microservices.currencyexchangeservice.controller;

import com.microservices.currencyexchangeservice.enums.Currency;
import com.microservices.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {

    @GetMapping("/from/{givenCurrency}/to/{targetCurrency}")
    public CurrencyExchange getExchangeValue(@PathVariable String givenCurrency,
                                             @PathVariable String targetCurrency){
        return new CurrencyExchange(1L, Currency.USD, Currency.EGP, BigDecimal.valueOf(30));
    }
}
