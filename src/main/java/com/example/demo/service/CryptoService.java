package com.example.demo.service;

import com.example.demo.model.Cryptocurrency;
import com.example.demo.model.CryptocurrencyTopOne;
import com.example.demo.utils.CurrenciesEnum;
import com.example.demo.utils.Deserializer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

@Service
public class CryptoService {

    Deserializer deserializer;

    public CryptoService(Deserializer deserializer) {
        this.deserializer = deserializer;
    }

    public Cryptocurrency getMostPopularCryptocurrencies(Integer id) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> cryptoDTO = objectMapper.readValue(new URL("https://api.cryptorank.io/v1/currencies/" + id + "?api_key=f2072f44fd29bc741ff95dd7d23cf7f871be10619841c2084b8b9e51dfaf"), new TypeReference<Map<String,Object>>(){});
        return deserializer.deserialize(cryptoDTO, id);
    }
}
