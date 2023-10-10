package com.yldog.payment.service.domain.event;

import com.yldog.domain.event.publisher.DomainEventPublisher;
import com.yldog.payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;
import java.util.Collections;

public class PaymentCancelledEvent extends PaymentEvent{

    private final DomainEventPublisher<PaymentCancelledEvent> paymentCancelledEventDomainEventPublisher;
    public PaymentCancelledEvent(Payment payment, ZonedDateTime zonedDateTime,
                                 DomainEventPublisher<PaymentCancelledEvent> paymentCancelledEventDomainEventPublisher) {
        super(payment, zonedDateTime, Collections.emptyList());
        this.paymentCancelledEventDomainEventPublisher = paymentCancelledEventDomainEventPublisher;
    }


    @Override
    public void fire() {
        paymentCancelledEventDomainEventPublisher.publish(this);
    }
}
