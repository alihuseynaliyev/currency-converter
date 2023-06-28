package com.example.asynclearn.service;

import com.example.asynclearn.client.ExchangeRatesClient;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class CurrencyExchangeService {
    private final ExchangeRatesClient exchangeRatesClient;

    @SneakyThrows
    @Async
    public BigDecimal getExchangeRate(String baseCurrency, String targetCurrency) {
        return exchangeRatesClient.getExchangeRate(baseCurrency, targetCurrency).getRates().get(targetCurrency);
    }
}
