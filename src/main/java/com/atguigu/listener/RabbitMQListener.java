package com.atguigu.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * @author Hobo
 * @create 2020-12-04 21:17
 */
@Component
public class RabbitMQListener {
    @RabbitListener(queues = "topic_queue")
    public void listenerQueue(Message message) throws UnsupportedEncodingException {
        System.out.println(new String(message.getBody(),"UTF-8"));
    }
}
