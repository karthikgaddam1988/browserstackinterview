package com.example.controller;

import com.example.model.HelloMessage;
import com.example.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageController {

    @MessageMapping("/tail")
    @SendTo("/topic/tail")
    public Message parseLog(HelloMessage message){
        return new Message("Hello, " + HtmlUtils.htmlEscape(message.getName()) +"!");
    }

}
