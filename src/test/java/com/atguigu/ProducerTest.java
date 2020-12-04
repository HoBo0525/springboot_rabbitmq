package com.atguigu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Hobo
 * @create 2020-12-04 21:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerTest {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    public void sendTest(){
        rabbitTemplate.convertAndSend("topic","boot.hobo","hobo!!!!!!!!!!!!!");
    }
}
