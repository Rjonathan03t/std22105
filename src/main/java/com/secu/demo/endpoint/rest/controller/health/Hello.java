package com.secu.demo.endpoint.rest.controller.health;

import com.secu.demo.PojaGenerated;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@AllArgsConstructor
public class Hello {
    @GetMapping("/hello")
    public String HelloWorld() {
        return "world";
    }
}
