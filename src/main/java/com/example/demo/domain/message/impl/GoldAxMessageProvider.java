package com.example.demo.domain.message.impl;

import com.example.demo.domain.axe.Axe;
import com.example.demo.domain.message.AxMessageProvider;
import org.springframework.stereotype.Component;

@Component
public class GoldAxMessageProvider implements AxMessageProvider {

    @Override
    public String getMessage() {
        return "You are a liar!";
    }

    @Override
    public Axe getKey() {
        return Axe.GoldAx;
    }

}
