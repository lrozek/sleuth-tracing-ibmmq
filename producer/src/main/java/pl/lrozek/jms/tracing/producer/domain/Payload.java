package pl.lrozek.jms.tracing.producer.domain;

import java.util.UUID;

import lombok.Value;

@Value
public class Payload {

    private String message;

    private UUID uuid;

}
