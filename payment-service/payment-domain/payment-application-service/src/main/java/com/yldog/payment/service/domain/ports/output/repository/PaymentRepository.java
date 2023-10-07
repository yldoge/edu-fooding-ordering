package com.yldog.payment.service.domain.ports.output.repository;

import com.yldog.payment.service.entity.Payment;

import java.util.Optional;
import java.util.UUID;

public interface PaymentRepository {

    Payment save(Payment payment);

    Optional<Payment> findByOrderId(UUID orderId);
}
