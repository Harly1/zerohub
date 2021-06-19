package com.zerohub.challenge.converter.currency;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class AudCurrencyConverter implements CurrencyConverter {
    @Override
    public BigDecimal convert(String currency, BigDecimal amount) {
        switch (currency) {
            case "BTC":
                return amount;
            case "AUD":
                return amount;
            case "RUB":
                return amount;
            case "EUR":
                return amount;
        }

        throw new RuntimeException("Can not convert currency from AUD to " + currency);
    }
}
