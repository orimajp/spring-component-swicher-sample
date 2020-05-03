package com.example.demo.domain.service.message.impl;

import com.example.demo.domain.model.axe.Axe;
import com.example.demo.domain.service.message.AxMessageService;
import org.springframework.stereotype.Component;

@Component
public class IronAxMessageService implements AxMessageService {

    @Override
    public String getMessage() {
        return "You are honest!";
    }

    @Override
    public Axe getComponentKey() {
        return Axe.IronAx;
    }

}
