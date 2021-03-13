package ru.savinov.springbeans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.savinov.springbeans.service.JavaConfigService;

@RestController
public class JavaConfigController {

    private JavaConfigService javaConfigService;

    @Autowired
    public JavaConfigController(JavaConfigService javaConfigService) {
        this.javaConfigService = javaConfigService;
    }

    @GetMapping("/java")
    public String hello() {
        return javaConfigService.hello();
    }
}
