package com.webraza.websocket123.controller;


import com.webraza.websocket123.model.MyResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {


    @MessageMapping("myMessage")
    @SendTo("/topic/messages") //kan sende til alle som subscriber
    public MyResponse handleMessage(){
        MyResponse myResponse = new MyResponse("Hej fra S");

        return myResponse;
    }

}
