package com.example.demo.application.service;

import com.example.demo.domain.model.axe.Axe;
import com.example.demo.domain.model.axe.AxeHolder;
import com.example.demo.domain.service.message.AxMessageService;
import com.example.demo.domain.service.message.AxMessageServiceFactory;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageApplicationService {

    private final AxMessageServiceFactory axMessageServiceFactory;

    public void setAxe(@NonNull String axeType) {
        final Axe axe = Axe.getAxe(axeType);
        AxeHolder.setAxe(axe);
    }

    public String getMessage() {
        final AxMessageService service = axMessageServiceFactory.getComponent();
        return service.getMessage();
    }

}
