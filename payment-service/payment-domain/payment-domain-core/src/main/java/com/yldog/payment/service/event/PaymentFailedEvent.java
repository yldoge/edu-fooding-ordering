package com.yldog.payment.service.event;

import com.yldog.payment.service.entity.Payment;

import java.time.ZonedDateTime;
import java.util.List;

public class PaymentFailedEvent extends PaymentEvent{
    public PaymentFailedEvent(Payment payment, ZonedDateTime zonedDateTime, List<String> failureMessages) {
        super(payment, zonedDateTime, failureMessages);
    }
}
