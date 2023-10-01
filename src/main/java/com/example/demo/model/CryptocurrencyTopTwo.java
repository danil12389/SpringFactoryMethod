package com.example.demo.model;

import com.example.demo.utils.CurrenciesEnum;
  import org.springframework.stereotype.Component;

@Component
public class CryptocurrencyTopTwo implements Cryptocurrency {


  public  CryptocurrencyTopTwo() {
  }

    double usdPrice;

    String name;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Double getUsdPrice() {
    return usdPrice;
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
    return CurrenciesEnum.TOP2;
  }
}
