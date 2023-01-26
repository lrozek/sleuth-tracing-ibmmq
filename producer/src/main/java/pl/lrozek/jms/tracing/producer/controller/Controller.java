package pl.lrozek.jms.tracing.producer.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.lrozek.jms.tracing.producer.domain.Payload;
import pl.lrozek.jms.tracing.producer.service.Sender;

@Slf4j
@RequiredArgsConstructor
@RestController
public class Controller {

    private final Sender sender;

    @PostMapping
    public void sendMessage() {
        log.info("endpoint invoked");
        sender.sendMessage(new Payload("Hello world", UUID.randomUUID()));
    }
}
