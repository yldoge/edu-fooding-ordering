package com.yldog.domain.event.publisher;

import com.yldog.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}
