package com.food.ordering.system.order.service.domain.ports.output.message.publisher.payment;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.event.OrderCancelledEvent;

/**
 * packageName    : com.food.ordering.system.order.service.domain.ports.output.message.publisher.payment
 * fileName       : OrderCancelledPaymentRequestMessagePublisher
 * author         : limsooyoung
 * date           : 1/22/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/22/25        limsooyoung       최초 생성
 */
public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
