package com.zerohub.challenge.converter.currency;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BtcCurrencyConverter implements CurrencyConverter {
    @Override
    public BigDecimal convert(String currency, BigDecimal amount) {
        switch (currency) {
            case "BTC":
                return amount;
            case "AUD":
                BigDecimal aud = new BigDecimal("75000");
                return amount.multiply(aud);
            case "RUB":
                BigDecimal rub = new BigDecimal("4640000");
                return amount.multiply(rub);
            case "EUR":
                BigDecimal eur = new BigDecimal("50000");
                return amount.multiply(eur);
        }

        throw new RuntimeException("Can not convert currency from BTC to " + currency);
    }
}
