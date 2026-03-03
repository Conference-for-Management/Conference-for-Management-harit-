package com.example.gestion_de_conferences.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ConferenceEventProducer {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendEvent(String topic, Object event) {
        log.info("Sending event to topic {}: {}", topic, event);
        kafkaTemplate.send(topic, event);
    }
}
