package com.microservices.currencyexchangeservice.controller;

import com.microservices.currencyexchangeservice.enums.Currency;
import com.microservices.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {
    
    @Autowired
    private Environment environment;

    @GetMapping("/from/{givenCurrency}/to/{targetCurrency}")
    public CurrencyExchange getExchangeValue(@PathVariable String givenCurrency,
                                             @PathVariable String targetCurrency){
        CurrencyExchange currencyExchange = new CurrencyExchange(1L, Currency.USD, Currency.EGP, BigDecimal.valueOf(30));
        String port = environment.getProperty("server.port");
        currencyExchange.setEnvironment(port);
        return currencyExchange;
    }
}
