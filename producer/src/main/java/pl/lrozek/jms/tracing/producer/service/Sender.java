package pl.lrozek.jms.tracing.producer.service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.lrozek.jms.tracing.producer.domain.Payload;

@Slf4j
@RequiredArgsConstructor
@Component
public class Sender {

    private final JmsTemplate jmsTemplate;

    public void sendMessage(Payload payload) {
        log.info("to send: {}", payload);
        jmsTemplate.convertAndSend("queue:///DEV.QUEUE.1", payload);
        log.info("message sent succesfully");
    }

}
