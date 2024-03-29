package com.food.ordering.system.order.service.domain.ports.input.message.listner.payment;

import com.food.ordering.system.order.service.domain.dto.message.PaymentResponse;

public interface PaymentResponseMessageListener {
    void paymentCompleted(PaymentResponse paymentResponse);

    void paymentFailed(PaymentResponse paymentResponse);
}
