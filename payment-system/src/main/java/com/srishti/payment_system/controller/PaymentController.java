package com.srishti.payment_system.controller;

import org.springframework.web.bind.annotation.*;
import com.srishti.payment_system.producer.PaymentProducer;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentProducer producer;

    public PaymentController(PaymentProducer producer) {
        this.producer = producer;
    }

    @PostMapping
    public String sendPayment(@RequestBody String payment) {
        producer.sendPayment(payment);
        return "Payment sent to Kafka";
    }
}