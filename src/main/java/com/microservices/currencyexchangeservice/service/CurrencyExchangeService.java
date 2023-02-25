package com.microservices.currencyexchangeservice.service;

import com.microservices.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.stereotype.Service;

@Service
public interface CurrencyExchangeService {
    CurrencyExchange getByGivenCurrencyAndTargetCurrency(String givenCurrency, String targetCurrency);
}
