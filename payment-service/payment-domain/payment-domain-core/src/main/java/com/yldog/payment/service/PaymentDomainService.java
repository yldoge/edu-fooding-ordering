package com.yldog.payment.service;

import com.yldog.domain.event.publisher.DomainEventPublisher;
import com.yldog.payment.service.entity.CreditEntry;
import com.yldog.payment.service.entity.CreditHistory;
import com.yldog.payment.service.entity.Payment;
import com.yldog.payment.service.event.PaymentCancelledEvent;
import com.yldog.payment.service.event.PaymentCompletedEvent;
import com.yldog.payment.service.event.PaymentEvent;
import com.yldog.payment.service.event.PaymentFailedEvent;

import java.util.List;

public interface PaymentDomainService {
    PaymentEvent validateAndInitiatePayment(Payment payment,
                                            CreditEntry creditEntry,
                                            List<CreditHistory> creditHistories,
                                            List<String> failureMessages,
                                            DomainEventPublisher<PaymentCompletedEvent> paymentCompletedEventDomainEventPublisher,
                                            DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher);

    PaymentEvent validateAndCancelPayment(Payment payment,
                                          CreditEntry creditEntry,
                                          List<CreditHistory> creditHistories,
                                          List<String> failureMessages,
                                          DomainEventPublisher<PaymentCancelledEvent> paymentCancelledEventDomainEventPublisher,
                                          DomainEventPublisher<PaymentFailedEvent> paymentFailedEventDomainEventPublisher);

}
