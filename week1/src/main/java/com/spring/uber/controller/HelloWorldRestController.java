package com.spring.uber.controller;

import com.spring.uber.domain.Message;
import com.spring.uber.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zoe on 5/26/17.
 */
@RestController
public class HelloWorldRestController {

    @Autowired
    HelloWorldService service;

    @RequestMapping("/")
    public String welcome() {
        return "Hello Spring Uber";
    }

    @RequestMapping(value = "/hello/{yourName}", method = RequestMethod.GET)
    public Message showMessage(@PathVariable final String yourName) {
        Message msg = service.createMessage(yourName, "Hello " + yourName);
        return msg;
    }
}
