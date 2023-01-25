package pl.lrozek.jms.tracing.producer.service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Component
public class Sender {

    private final JmsTemplate jmsTemplate;

    public void sendMessage() {
        jmsTemplate.convertAndSend("queue:///DEV.QUEUE.1", "hello World");
        log.info("message sent succesfully");
    }

}
