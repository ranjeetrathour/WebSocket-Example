package com.example.controller;

import com.example.modle.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/push")
    public Message message(@RequestBody Message message){
        System.out.println(message.getMessage());
        return message;
    }
}
