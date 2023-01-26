package pl.lrozek.jms.tracing.consumer.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MessageListener {

    @JmsListener(destination = "DEV.QUEUE.1")
    public void receiveMessage(String payload) {
        log.info("received following payload: {}", payload);
    }

}
