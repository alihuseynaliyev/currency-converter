package com.example.asynclearn.client;

import com.example.asynclearn.model.response.ExchangeRateResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "exchangeRatesClient", url = "https://api.exchangerate.host")
public interface ExchangeRatesClient {

    @GetMapping("/latest")
    ExchangeRateResponse getExchangeRate(@RequestParam("base") String baseCurrency,
                                         @RequestParam("symbols") String targetCurrency);
}
