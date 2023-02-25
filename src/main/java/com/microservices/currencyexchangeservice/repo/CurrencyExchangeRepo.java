package com.microservices.currencyexchangeservice.repo;

import com.microservices.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findByGivenCurrencyAndTargetCurrency(String givenCurrency, String targetCurrency);
}
