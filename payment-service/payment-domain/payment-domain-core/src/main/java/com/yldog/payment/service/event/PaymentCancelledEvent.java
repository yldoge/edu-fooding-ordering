package com.yldog.payment.service.event;

import com.yldog.payment.service.entity.Payment;

import java.time.ZonedDateTime;
import java.util.Collections;

public class PaymentCancelledEvent extends PaymentEvent{
    public PaymentCancelledEvent(Payment payment, ZonedDateTime zonedDateTime) {
        super(payment, zonedDateTime, Collections.emptyList());
    }
}
