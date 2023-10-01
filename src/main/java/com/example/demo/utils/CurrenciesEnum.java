package com.example.demo.utils;

import java.util.HashMap;
import java.util.Map;

public enum CurrenciesEnum {
    TOP1(1),
    TOP2(2),
    TOP3(3);

    private static final Map<Integer, CurrenciesEnum> inputTags = new HashMap<>();

    public final int value;
    CurrenciesEnum(int i) {
        this.value = i;
    }

    static {
        for (CurrenciesEnum e : values()) {
            inputTags.put(1, e.TOP1);
            inputTags.put(2, e.TOP2);
        }
    }

    public static Map<Integer, CurrenciesEnum> getMapping() {
        return inputTags;
    }
}
