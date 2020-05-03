package com.example.demo.domain.service.message;

import com.example.demo.domain.model.axe.Axe;
import com.example.demo.domain.model.axe.AxeHolder;
import com.example.demo.domain.shared.switchable.SwitchableFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class AxMessageServiceFactory extends SwitchableFactory<Axe, AxMessageService> {

    private final List<AxMessageService> axMessageServices;

    @PostConstruct
    public void init() {
        register(axMessageServices);
    }

    @Override
    protected Axe getComponentKey() {
        return AxeHolder.getAxe();
    }

}
