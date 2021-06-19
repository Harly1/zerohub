package com.zerohub.challenge.converter.currency;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class EurCurrencyConverter implements CurrencyConverter {
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
                return amount;
        }

        throw new RuntimeException("Can not convert currency from EUR to " + currency);
    }
}
