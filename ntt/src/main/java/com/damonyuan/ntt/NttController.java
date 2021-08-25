package com.damonyuan.ntt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class NttController {
    private static final String template = "Hello, %s! profile is %s and env is %s";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private Config config;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name, config.getProfileName(), config.getEnvName()));
    }
}
