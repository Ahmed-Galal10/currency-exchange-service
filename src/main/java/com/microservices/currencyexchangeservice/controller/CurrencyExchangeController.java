package com.microservices.currencyexchangeservice.controller;

import com.microservices.currencyexchangeservice.model.CurrencyExchange;
import com.microservices.currencyexchangeservice.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency-exchange")
public class CurrencyExchangeController {

    @Autowired
    private CurrencyExchangeService currencyExchangeService;

    @GetMapping("/from/{givenCurrency}/to/{targetCurrency}")
    public CurrencyExchange getExchangeValue(@PathVariable String givenCurrency,
                                             @PathVariable String targetCurrency) {
        return currencyExchangeService.getByGivenCurrencyAndTargetCurrency(givenCurrency, targetCurrency);
    }
}
