package com.example.demo.domain.message;

import com.example.demo.domain.axe.Axe;
import com.example.demo.domain.axe.AxeHolder;
import com.example.demo.domain.shared.switchable.SwitchableFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class AxMessageProviderFactory extends SwitchableFactory<Axe, AxMessageProvider> {

    private final List<AxMessageProvider> axMessageProviders;

    @PostConstruct
    public void init() {
        register(axMessageProviders);
    }

    @Override
    protected Axe getComponentKey() {
        return AxeHolder.getAxe();
    }

}
