package com.yldog.order.service.domain;

import com.yldog.order.service.domain.entity.Order;
import com.yldog.order.service.domain.entity.Restaurant;
import com.yldog.order.service.domain.event.OrderCancelledEvent;
import com.yldog.order.service.domain.event.OrderCreatedEvent;
import com.yldog.order.service.domain.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {
    OrderCreatedEvent validateAndinitiateOrder(Order order, Restaurant restaurant);
    OrderPaidEvent payOrder(Order order);
    void approveOrder(Order order);
    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);
    void cancelOrder(Order order, List<String> failureMessages);
}
