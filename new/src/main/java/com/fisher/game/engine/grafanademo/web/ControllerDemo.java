package com.fisher.game.engine.grafanademo.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class ControllerDemo {

    @GetMapping("/demo")
    public String demo() {
        return "Demo message";
    }

}
