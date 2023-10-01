package com.example.demo.utils;

import com.example.demo.model.Cryptocurrency;
import com.example.demo.model.CryptocurrencyTopOne;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Deserializer {

    CryptoFactory cryptoFactory;


    public Deserializer(CryptoFactory cryptoFactory) {
        this.cryptoFactory = cryptoFactory;
    }

    public Cryptocurrency deserialize(Object cryptoDTO, Integer id) {
        Map<String, Object> cryptoDTO1 = (Map<String, Object>) cryptoDTO;
        Map<String, Object> data = (Map<String, Object>) cryptoDTO1.get("data");
        Map<String, Object> values = (Map<String, Object>) data.get("values");
        Map<String, Object> usd = (Map<String, Object>) values.get("USD");
        Cryptocurrency cryptocurrency = cryptoFactory.getCurrency(id);
        cryptocurrency.setName(data.get("name").toString());
        cryptocurrency.setUsdPrice((Double) usd.get("price"));
        return cryptocurrency;
    }
}
