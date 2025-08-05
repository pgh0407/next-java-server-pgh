package com.next.app.api.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "Hello Controller", description = "헬로 봉주르 니하오 안녕")
public class HelloController {

    @GetMapping("/hello")
    @Operation(summary = "Hello 메시지 반환", description = "잔인한 QUEEN이며 SCENE이자 JONGGYEOL. 이토록 거대한 내 안의 EXPLOSION 내 모든 세포 별로부터 만들어져.")
    public String hello() {
        return "Hello, Spring Boot with Swagger!";
    }
} 