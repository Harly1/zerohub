package com.zerohub.challenge.factory;

import com.zerohub.challenge.converter.currency.CurrencyConverter;
import org.springframework.stereotype.Component;

@Component
public class ConverterFactoryImpl implements CurrencyConverterFactory {
    final CurrencyConverter btcCurrencyConverter;
    final CurrencyConverter audCurrencyConverter;
    final CurrencyConverter rubCurrencyConverter;
    final CurrencyConverter eurCurrencyConverter;

    public ConverterFactoryImpl(CurrencyConverter eurCurrencyConverter, CurrencyConverter rubCurrencyConverter,
                                CurrencyConverter audCurrencyConverter, CurrencyConverter btcCurrencyConverter) {
        this.eurCurrencyConverter = eurCurrencyConverter;
        this.rubCurrencyConverter = rubCurrencyConverter;
        this.audCurrencyConverter = audCurrencyConverter;
        this.btcCurrencyConverter = btcCurrencyConverter;
    }

    public CurrencyConverter getConverterByCurrency(String currency) {
        switch (currency) {
            case "BTC":
                return btcCurrencyConverter;
            case "AUD":
                return audCurrencyConverter;
            case "RUB":
                return rubCurrencyConverter;
            case "EUR":
                return eurCurrencyConverter;
        }
        throw new RuntimeException("Currency converter not found for " + currency);
    }
}
