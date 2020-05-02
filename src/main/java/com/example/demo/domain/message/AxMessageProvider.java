package com.example.demo.domain.message;

import com.example.demo.domain.axe.Axe;
import com.example.demo.domain.shared.switchable.Switchable;

public interface AxMessageProvider extends Switchable<Axe> {

    String getMessage();

}
