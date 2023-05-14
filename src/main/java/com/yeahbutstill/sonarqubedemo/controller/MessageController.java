package com.yeahbutstill.sonarqubedemo.controller;

import com.yeahbutstill.sonarqubedemo.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageServiceImpl messageService;

    @GetMapping("/")
    public String getMessage() {
        return messageService.getMessage();
    }

}
