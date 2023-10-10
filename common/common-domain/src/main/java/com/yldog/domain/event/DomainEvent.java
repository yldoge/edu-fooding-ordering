package com.yldog.domain.event;

public interface DomainEvent<T> {
    void fire();
}
