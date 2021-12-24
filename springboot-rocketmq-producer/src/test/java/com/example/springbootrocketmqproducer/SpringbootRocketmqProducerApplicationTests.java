package com.example.springbootrocketmqproducer;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootRocketmqProducerApplicationTests {
    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 发送主题，消息内容
     */
    @Test
    public void test() {
        rocketMQTemplate.convertAndSend("springboot-rocketmq","Hello springboot-rocketmq");
    }
    @Test
    public void test2() {
        System.out.println("");
    }

}
