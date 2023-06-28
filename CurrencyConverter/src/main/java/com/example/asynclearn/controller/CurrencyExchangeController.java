package com.example.asynclearn.controller;

import com.example.asynclearn.service.CurrencyExchangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@CrossOrigin
@RequestMapping("api/v1/exchange")
@RequiredArgsConstructor
public class CurrencyExchangeController {
    private final CurrencyExchangeService currencyExchangeService;

    @GetMapping
    public BigDecimal getExchangeRates(@RequestParam String baseCurrency,
                                       @RequestParam String targetCurrency) {
        return currencyExchangeService.getExchangeRate(baseCurrency, targetCurrency);
    }

}
