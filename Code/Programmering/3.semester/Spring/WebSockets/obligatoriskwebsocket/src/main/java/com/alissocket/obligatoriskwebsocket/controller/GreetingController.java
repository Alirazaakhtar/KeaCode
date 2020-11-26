package com.alissocket.obligatoriskwebsocket.controller;

import com.alissocket.obligatoriskwebsocket.model.Greeting;
import com.alissocket.obligatoriskwebsocket.model.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello") // server kan modtage requests
    @SendTo("/topic/greetings") // server sender til alle klienter, som har
    // subscribet til /topic/greetings
    public Greeting greeting(HelloMessage helloMessage) {
        String s = HtmlUtils.htmlEscape(helloMessage.getName());
        return new Greeting(s);
    }
}
