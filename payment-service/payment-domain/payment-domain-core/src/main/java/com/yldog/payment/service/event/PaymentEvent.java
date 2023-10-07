package com.yldog.payment.service.event;

import com.yldog.domain.event.DomainEvent;
import com.yldog.payment.service.entity.Payment;

import java.time.ZonedDateTime;
import java.util.List;

public abstract class PaymentEvent implements DomainEvent<Payment> {
    private final Payment payment;
    private final ZonedDateTime zonedDateTime;
    private final List<String> failureMessages;

    public PaymentEvent(Payment payment, ZonedDateTime zonedDateTime, List<String> failureMessages) {
        this.payment = payment;
        this.zonedDateTime = zonedDateTime;
        this.failureMessages = failureMessages;
    }

    public Payment getPayment() {
        return payment;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    public List<String> getFailureMessages() {
        return failureMessages;
    }
}
