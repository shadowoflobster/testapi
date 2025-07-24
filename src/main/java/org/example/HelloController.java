package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/joke")
    public Map<String, String> getJoke() {
        return Collections.singletonMap("joke", "Why did the Java developer go broke? Because he used up all his cache!ruuuuuuuuuuun!!!");
    }
}