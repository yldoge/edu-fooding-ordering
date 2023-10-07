package com.yldog.payment.service.domain.ports.output.message.publisher;

import com.yldog.domain.event.publisher.DomainEventPublisher;
import com.yldog.payment.service.event.PaymentCancelledEvent;

public interface PaymentCancelledMessagePublisher extends DomainEventPublisher<PaymentCancelledEvent> {
}
