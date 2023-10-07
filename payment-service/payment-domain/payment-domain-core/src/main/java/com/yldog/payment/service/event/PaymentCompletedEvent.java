package com.yldog.payment.service.event;

import com.yldog.payment.service.entity.Payment;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

public class PaymentCompletedEvent extends PaymentEvent{
    public PaymentCompletedEvent(Payment payment, ZonedDateTime zonedDateTime) {
        super(payment, zonedDateTime, Collections.emptyList());
    }
}
