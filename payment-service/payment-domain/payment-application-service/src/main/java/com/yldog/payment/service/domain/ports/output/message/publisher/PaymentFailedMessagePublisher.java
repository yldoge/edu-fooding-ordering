package com.yldog.payment.service.domain.ports.output.message.publisher;

import com.yldog.domain.event.publisher.DomainEventPublisher;
import com.yldog.payment.service.event.PaymentFailedEvent;

public interface PaymentFailedMessagePublisher extends DomainEventPublisher<PaymentFailedEvent> {
}
