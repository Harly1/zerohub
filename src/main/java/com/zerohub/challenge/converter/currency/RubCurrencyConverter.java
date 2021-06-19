package com.zerohub.challenge.converter.currency;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class RubCurrencyConverter implements CurrencyConverter {
    @Override
    public BigDecimal convert(String currency, BigDecimal amount) {
        switch (currency) {
            case "BTC":
                BigDecimal btc = new BigDecimal("50000.0000");
                return amount.divide(btc, RoundingMode.UNNECESSARY);
            case "AUD":
                return amount;
            case "RUB":
                return amount;
            case "EUR":
                BigDecimal eur = new BigDecimal("96.0000");
                return amount.divide(eur, RoundingMode.UNNECESSARY);
        }

        throw new RuntimeException("Can not convert currency from RUB to " + currency);
    }
}
