package com.atguigu.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hobo
 * @create 2020-12-04 21:04
 */
@Configuration
public class RabbitMQConfig {
    //创建交换机
    @Bean
    public Exchange bootExchange(){
        return
                ExchangeBuilder.topicExchange("topic").build();
    }

    //创建队列
    @Bean
    public Queue bootQueue(){
        return
                QueueBuilder.durable("topic_queue").build();
    }

    //绑定
    @Bean
    public Binding bootBinding(@Qualifier("bootExchange") Exchange exchange, @Qualifier("bootQueue") Queue queue){
        return
                BindingBuilder.bind(queue).to(exchange).with("boot.#").noargs();
    }
}
