package com.example.springbootrocketmqproducer;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringbootRocketmqProducerApplication {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRocketmqProducerApplication.class, args);
    }

    /**
     * 发送主题，消息内容
     */
    @Test
    public void test() {
        rocketMQTemplate.convertAndSend("springboot-rocketmq", "Hello springboot-rocketmq");
        log.info("消息发送成功");
    }
}
