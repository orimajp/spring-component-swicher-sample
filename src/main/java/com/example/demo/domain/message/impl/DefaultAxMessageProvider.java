package com.example.demo.domain.message.impl;

import com.example.demo.domain.axe.Axe;
import com.example.demo.domain.message.AxMessageProvider;
import org.springframework.stereotype.Component;

@Component
public class DefaultAxMessageProvider implements AxMessageProvider {

    @Override
    public String getMessage() {
        return "I don't know that ax.";
    }

    @Override
    public Axe getKey() {
        return Axe.OtherAx;
    }

    @Override
    public boolean isDefault() {
        return true;
    }

}
