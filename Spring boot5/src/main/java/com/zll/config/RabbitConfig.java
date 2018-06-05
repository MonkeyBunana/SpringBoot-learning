package com.zll.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zll on 2018/3/27 0027.
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

}
