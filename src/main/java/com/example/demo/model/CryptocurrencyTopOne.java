package com.example.demo.model;

import com.example.demo.utils.CurrenciesEnum;
import org.springframework.stereotype.Component;


@Component
public class CryptocurrencyTopOne implements Cryptocurrency {

    double usdPrice;

    String name;


    public CryptocurrencyTopOne() {
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getUsdPrice() {
        return this.usdPrice;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setUsdPrice(double price) {
        this.usdPrice = price;
    }

    @Override
    public CurrenciesEnum getType() {
        return CurrenciesEnum.TOP1;
    }
}
