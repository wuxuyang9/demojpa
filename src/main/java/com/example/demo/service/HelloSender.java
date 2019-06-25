package com.example.demo.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by goodwuxuyang on 2019/6/9.
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate amqpTemplatel;

    public void send(){
        String context = "hello----"+LocalDateTime.now();
        System.out.println("send:"+context);
        amqpTemplatel.convertAndSend("hello",context);
    }

    public void sendFanout(){
        String context = "hello fanout----"+LocalDateTime.now();
        System.out.println("send:"+context);
        amqpTemplatel.convertAndSend("fanout.ex","",context);
    }
}
