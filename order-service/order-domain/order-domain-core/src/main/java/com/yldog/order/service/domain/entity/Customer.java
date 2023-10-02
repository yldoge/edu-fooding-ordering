package com.yldog.order.service.domain.entity;

import com.yldog.domain.entity.AggregateRoot;
import com.yldog.domain.valueobject.CustomerId;

public class Customer extends AggregateRoot<CustomerId> {
    public Customer() {
    }

    public Customer(CustomerId customerId) {
        super.setId(customerId);
    }
}
