package com.yldog.payment.service.domain.ports.output.repository;

import com.yldog.domain.valueobject.CustomerId;
import com.yldog.payment.service.entity.CreditHistory;

import java.util.List;
import java.util.Optional;

public interface CreditHistoryRepository {
    CreditHistory save(CreditHistory creditHistory);
    Optional<List<CreditHistory>> findByCustomerId(CustomerId customerId);
}
