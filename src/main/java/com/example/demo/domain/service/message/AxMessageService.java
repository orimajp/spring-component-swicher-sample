package com.example.demo.domain.service.message;

import com.example.demo.domain.model.axe.Axe;
import com.example.demo.domain.shared.switchable.Switchable;

public interface AxMessageService extends Switchable<Axe> {

    String getMessage();

}
