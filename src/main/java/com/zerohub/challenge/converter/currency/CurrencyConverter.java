package com.zerohub.challenge.converter.currency;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public interface CurrencyConverter {
    BigDecimal convert(String currency, BigDecimal amount);
}
