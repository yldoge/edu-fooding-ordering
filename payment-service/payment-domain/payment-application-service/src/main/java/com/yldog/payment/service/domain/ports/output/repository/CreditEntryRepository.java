package com.yldog.payment.service.domain.ports.output.repository;

import com.yldog.domain.valueobject.CustomerId;
import com.yldog.payment.service.domain.entity.CreditEntry;

import java.util.Optional;

public interface CreditEntryRepository {
    CreditEntry save(CreditEntry creditEntry);
    Optional<CreditEntry> findByCustomerId(CustomerId customerId);
}
