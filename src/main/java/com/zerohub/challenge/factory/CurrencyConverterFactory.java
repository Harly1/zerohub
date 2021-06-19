package com.zerohub.challenge.factory;

import com.zerohub.challenge.converter.currency.CurrencyConverter;

public interface CurrencyConverterFactory {
    CurrencyConverter getConverterByCurrency(String name);
}
