package com.yldog.payment.service.domain.event;

import com.yldog.domain.event.publisher.DomainEventPublisher;
import com.yldog.payment.service.domain.entity.Payment;

import java.time.ZonedDateTime;
import java.util.List;

public class PaymentFailedEvent extends PaymentEvent{
    private final DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher;
    public PaymentFailedEvent(Payment payment,
                              ZonedDateTime zonedDateTime,
                              List<String> failureMessages,
                              DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher) {
        super(payment, zonedDateTime, failureMessages);
        this.paymentFailedEventDomainEventPublisher = paymentFailedEventDomainEventPublisher;
    }


    @Override
    public void fire() {
        paymentFailedEventDomainEventPublisher.publish(this);
    }
}
