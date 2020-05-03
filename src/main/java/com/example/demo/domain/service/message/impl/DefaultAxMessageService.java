package com.example.demo.domain.service.message.impl;

import com.example.demo.domain.model.axe.Axe;
import com.example.demo.domain.service.message.AxMessageService;
import org.springframework.stereotype.Component;

@Component
public class DefaultAxMessageService implements AxMessageService {

    @Override
    public String getMessage() {
        return "I don't know that ax.";
    }

    @Override
    public Axe getComponentKey() {
        return Axe.OtherAx;
    }

    @Override
    public boolean isDefault() {
        return true;
    }

}
