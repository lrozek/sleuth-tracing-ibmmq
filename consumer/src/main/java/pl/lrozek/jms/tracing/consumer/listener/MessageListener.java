package pl.lrozek.jms.tracing.consumer.listener;

import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class MessageListener {

    @NewSpan
    @JmsListener(destination = "DEV.QUEUE.1")
    public void receiveMessage(@SpanTag("payload") String payload) {
        log.info("received following payload: {}", payload);
    }

}
