package com.example.demo.config;

import com.example.demo.domain.model.axe.AxeHolder;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AxeAdvice {

    @After("@within(org.springframework.stereotype.Controller)")
    public void axeAdvice() {
        AxeHolder.removeAxe();
    }

}
