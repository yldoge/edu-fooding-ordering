package com.yldog.payment.service;

import com.yldog.payment.service.entity.CreditEntry;
import com.yldog.payment.service.entity.CreditHistory;
import com.yldog.payment.service.entity.Payment;
import com.yldog.payment.service.event.PaymentEvent;

import java.util.List;

public interface PaymentDomainService {
    PaymentEvent validateAndInitiatePayment(Payment payment,
                                            CreditEntry creditEntry,
                                            List<CreditHistory> creditHistories,
                                            List<String> failureMessages);

    PaymentEvent validateAndCancelPayment(Payment payment,
                                            CreditEntry creditEntry,
                                            List<CreditHistory> creditHistories,
                                            List<String> failureMessages);

}
