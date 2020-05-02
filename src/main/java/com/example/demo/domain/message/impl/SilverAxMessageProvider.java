package com.example.demo.domain.message.impl;

import com.example.demo.domain.axe.Axe;
import com.example.demo.domain.message.AxMessageProvider;
import org.springframework.stereotype.Component;

@Component
public class SilverAxMessageProvider implements AxMessageProvider {

    @Override
    public String getMessage() {
        return "You are eccentric!";
    }

    @Override
    public Axe getKey() {
        return Axe.SilverAx;
    }

}
