package com.example.demo.presentation.controller;

import com.example.demo.application.MessageService;
import com.example.demo.domain.axe.InvalidAxeTypeException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @GetMapping
    public String init() {
        return "index";
    }

    @GetMapping("select/{axe}")
    public String select(Model model, @PathVariable("axe") String axe) {
        messageService.setAxe(axe);
        final String message = messageService.getMessage();
        model.addAttribute("message", message);
        return "answer";
    }

    @ExceptionHandler(InvalidAxeTypeException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleInvalidAxeTypeException() {
        return "invalid";
    }

}
