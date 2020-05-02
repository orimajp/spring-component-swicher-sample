package com.example.demo.domain.message.impl;

import com.example.demo.domain.axe.Axe;
import com.example.demo.domain.message.AxMessageProvider;
import org.springframework.stereotype.Component;

@Component
public class IronAxMessageProvider implements AxMessageProvider {

    @Override
    public String getMessage() {
        return "You are honest!";
    }

    @Override
    public Axe getKey() {
        return Axe.IronAx;
    }

}
