package com.example.Strategies;

import com.example.Strategy;

public class Addition implements Strategy {

    @Override
    public float calculation(float a, float b) {
        return a+b;
    }
}
