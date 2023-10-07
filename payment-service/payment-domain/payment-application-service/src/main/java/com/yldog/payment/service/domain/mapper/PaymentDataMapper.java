package com.yldog.payment.service.domain.mapper;

import com.yldog.domain.valueobject.CustomerId;
import com.yldog.domain.valueobject.Money;
import com.yldog.domain.valueobject.OrderId;
import com.yldog.payment.service.domain.dto.PaymentRequest;
import com.yldog.payment.service.entity.Payment;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PaymentDataMapper {
    public Payment paymentRequestModelToPayment(PaymentRequest paymentRequest) {
        return Payment.builder()
                .orderId(new OrderId(UUID.fromString(paymentRequest.getOrderId())))
                .customerId(new CustomerId(UUID.fromString(paymentRequest.getCustomerId())))
                .price(new Money(paymentRequest.getPrice()))
                .build();
    }
}
