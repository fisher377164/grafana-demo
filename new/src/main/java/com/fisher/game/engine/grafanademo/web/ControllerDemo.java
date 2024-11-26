package com.fisher.game.engine.grafanademo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ControllerDemo {

    @GetMapping("/demo")
    public String demo() {
        return "Demo message";
    }

    @GetMapping("/demo/{message}")
    public String demo(@PathVariable String message) {
        if (Objects.equals(message, "error")) {
            throw new RuntimeException("LOL: ERROR!");
        }
        return "Demo message: " + message;
    }

}
