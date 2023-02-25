package com.microservices.currencyexchangeservice.enums.converter;

import com.microservices.currencyexchangeservice.enums.Currency;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class CurrencyEnumConverter implements AttributeConverter<Currency, String> {
    @Override
    public String convertToDatabaseColumn(Currency currency) {
        if (currency == null) {
            return null;
        }
        return currency.getCurrency();
    }

    @Override
    public Currency convertToEntityAttribute(String currency) {
        if (currency == null) {
            return null;
        }

        return Stream.of(Currency.values())
                .filter(c -> c.getCurrency().equals(currency))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
