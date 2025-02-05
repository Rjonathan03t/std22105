package com.secu.demo.endpoint;

import com.secu.demo.PojaGenerated;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@AllArgsConstructor
public class Hello {

    public static final ResponseEntity<String> OK = new ResponseEntity<>("OK", HttpStatus.OK);
    public static final ResponseEntity<String> KO =
            new ResponseEntity<>("KO", HttpStatus.INTERNAL_SERVER_ERROR);

    @GetMapping("/hello")
    public String hello() {
        return "world";
    }
}
