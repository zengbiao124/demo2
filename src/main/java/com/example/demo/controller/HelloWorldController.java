package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private Logger log= LoggerFactory.getLogger(HelloWorldController.class);
    @GetMapping("index")
    public String index(){
        log.info("HelloWorldController-index用于测试的info日志");
        log.debug("HelloWorldController-index用于测试的debug日志");
        log.error("HelloWorldController-index用于测试的error日志");
        return "Hello spring boot!";
    }
}