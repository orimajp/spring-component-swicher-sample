package com.example.demo.application;

import com.example.demo.domain.axe.Axe;
import com.example.demo.domain.axe.AxeHolder;
import com.example.demo.domain.message.AxMessageProvider;
import com.example.demo.domain.message.AxMessageProviderFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final AxMessageProviderFactory axMessageProviderFactory;

    public void setAxe(String axeType) {
        final Axe axe = Axe.getAxe(axeType);
        AxeHolder.setAxe(axe);
    }

    public String getMessage() {
        final AxMessageProvider provider = axMessageProviderFactory.getComponent();
        return provider.getMessage();
    }

}
