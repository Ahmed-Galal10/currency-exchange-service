package com.microservices.currencyexchangeservice.service.impl;

import com.microservices.currencyexchangeservice.model.CurrencyExchange;
import com.microservices.currencyexchangeservice.repo.CurrencyExchangeRepo;
import com.microservices.currencyexchangeservice.service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeServiceImpl implements CurrencyExchangeService {

    @Autowired
    private Environment environment;

    @Autowired
    private CurrencyExchangeRepo currencyExchangeRepo;

    @Override
    public CurrencyExchange getByGivenCurrencyAndTargetCurrency(String givenCurrency, String targetCurrency) {
        CurrencyExchange currencyExchange = currencyExchangeRepo.findByGivenCurrencyAndTargetCurrency(givenCurrency, targetCurrency);
        String port = environment.getProperty("server.port");
        currencyExchange.setEnvironment(port);

        return currencyExchange;
    }
}
