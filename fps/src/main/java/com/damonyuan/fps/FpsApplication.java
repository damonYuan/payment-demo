package com.damonyuan.fps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class FpsApplication {
    public static void main(String[] args) {
        SpringApplication.run(FpsApplication.class, args);
    }
}