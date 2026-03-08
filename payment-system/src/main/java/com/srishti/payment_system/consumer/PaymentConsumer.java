package com.srishti.payment_system.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumer {

    @KafkaListener(topics = "payments", groupId = "payment_group")
    public void consume(String message) {
        System.out.println("Payment received: " + message);
    }
}