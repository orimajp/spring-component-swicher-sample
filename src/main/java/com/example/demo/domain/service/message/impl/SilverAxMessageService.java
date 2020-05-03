package com.example.demo.domain.service.message.impl;

import com.example.demo.domain.model.axe.Axe;
import com.example.demo.domain.service.message.AxMessageService;
import org.springframework.stereotype.Component;

@Component
public class SilverAxMessageService implements AxMessageService {

    @Override
    public String getMessage() {
        return "You are eccentric!";
    }

    @Override
    public Axe getComponentKey() {
        return Axe.SilverAx;
    }

}
