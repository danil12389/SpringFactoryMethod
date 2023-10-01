package com.example.demo.controller;

import com.example.demo.model.Cryptocurrency;
import com.example.demo.service.CryptoService;
import com.example.demo.utils.CurrenciesEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@CrossOrigin
public class CryptoController {

    CryptoService cryptoService;

    public CryptoController(CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }

    //Достаем информацию по топ-3 валютам на данный момент.
    @GetMapping("test")
    public Cryptocurrency getCryptocurrencyPrices(@RequestParam int id) throws IOException {
        return  cryptoService.getMostPopularCryptocurrencies(id);
    }

}
