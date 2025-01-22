package com.food.ordering.system.order.service.domain.ports.input.message.listener.payment;

import com.food.ordering.system.order.service.domain.dto.message.PaymentResponse;

/**
 * packageName    : com.food.ordering.system.order.service.domain.ports.input.message.listener.payment
 * fileName       : PaymentResponseMessageListener
 * author         : limsooyoung
 * date           : 1/22/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/22/25        limsooyoung       최초 생성
 */
public interface PaymentResponseMessageListener {

    void paymentCompleted(PaymentResponse paymentResponse);

    void paymentCancelled(PaymentResponse paymentResponse);
}
