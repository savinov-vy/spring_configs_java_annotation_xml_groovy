package ru.savinov.springbeans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.savinov.springbeans.service.HelloXmlService;

@RestController
public class XmlController {

    private final HelloXmlService helloXmlService;

    @Autowired
    public XmlController(HelloXmlService helloXmlService) {
        this.helloXmlService = helloXmlService;
    }

    @GetMapping("/xml")
    public String helloXml() {
        return helloXmlService.getHelloXml();
    }
}
