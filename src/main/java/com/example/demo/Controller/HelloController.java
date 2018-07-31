package com.example.demo.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wos098
 * @create 2018-07-31 15:05
 * @desc
 **/
@Slf4j
@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public String hello(){
        log.info("进入SpringBoot HelloWorld");
        return "Hello World";
    }
}
