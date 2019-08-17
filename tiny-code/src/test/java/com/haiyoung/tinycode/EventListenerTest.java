package com.haiyoung.tinycode;

import com.haiyoung.tinycode.event.MqStringEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Haiyang Shao
 * @Date: 2019-08-17 20:33
 * @Version 1.0
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class EventListenerTest {

    @Autowired
    private ApplicationEventPublisher publisher;

    @Test
    public void publishMessageTest(){
        System.out.println("------begin-------");
        publisher.publishEvent(MqStringEvent
                .builder().topic("HY")
                .tag("STRING_EVENT")
                .key("key")
                .msg("msg")
                .messageId("messageId")
                .build());
        System.out.println("------end---------");
    }
}
