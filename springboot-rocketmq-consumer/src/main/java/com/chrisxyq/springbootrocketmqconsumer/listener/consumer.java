package com.example.springbootrocketmqconsumer.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author chrisxu
 * @create 2021-10-31 19:08
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */

/**
 * 监听String类型消息
 */
@Component
@RocketMQMessageListener(topic = "springboot-rocketmq",consumerGroup ="${rocketmq.consumer.group}" )
public class consumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("接收到消息"+s);
    }
}
