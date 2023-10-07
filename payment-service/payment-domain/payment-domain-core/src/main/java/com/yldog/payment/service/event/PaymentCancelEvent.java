package com.yldog.payment.service.event;

import com.yldog.payment.service.entity.Payment;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

public class PaymentCancelEvent extends PaymentEvent{
    public PaymentCancelEvent(Payment payment, ZonedDateTime zonedDateTime) {
        super(payment, zonedDateTime, Collections.emptyList());
    }
}
