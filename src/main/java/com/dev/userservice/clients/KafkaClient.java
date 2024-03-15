package com.dev.userservice.clients;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaClient {
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaClient(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, String message){
        kafkaTemplate.send(topic, message);

    }
}
