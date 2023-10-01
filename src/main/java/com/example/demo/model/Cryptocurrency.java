package com.example.demo.model;

import com.example.demo.utils.CurrenciesEnum;

public interface Cryptocurrency {

    String getName();

    Double getUsdPrice();


    void setName(String name);

    void setUsdPrice(double price);

    CurrenciesEnum getType();
}
