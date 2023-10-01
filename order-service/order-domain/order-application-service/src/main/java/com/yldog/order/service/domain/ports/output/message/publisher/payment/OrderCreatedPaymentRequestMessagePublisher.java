package com.yldog.order.service.domain.ports.output.message.publisher.payment;

import com.yldog.domain.event.publisher.DomainEventPublisher;
import com.yldog.order.service.domain.event.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {
}
