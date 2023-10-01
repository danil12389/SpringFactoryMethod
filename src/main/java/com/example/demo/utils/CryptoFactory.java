package com.example.demo.utils;


import com.example.demo.model.Cryptocurrency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CryptoFactory {


    private static final Map<CurrenciesEnum, Cryptocurrency> currencyMap = new HashMap<>();

    @Autowired
    private CryptoFactory(List<Cryptocurrency> cryptocurrencyList) {
        for (Cryptocurrency cryptocurrency : cryptocurrencyList) {
            currencyMap.put(cryptocurrency.getType(), cryptocurrency);
        }
    }

    public Cryptocurrency getCurrency(int id) {
        Cryptocurrency cryptocurrency = currencyMap.get(CurrenciesEnum.getMapping().get(id));
        if(cryptocurrency == null) throw new RuntimeException("Unknown service type");
        return cryptocurrency;
    }


}