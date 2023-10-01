package com.yldog.order.service.domain.ports.output.message.publisher.restaurantapproval;

import com.yldog.domain.event.publisher.DomainEventPublisher;
import com.yldog.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidPaymentRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
