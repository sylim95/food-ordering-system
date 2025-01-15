package com.food.ordering.system.order.service.domain.event;

import com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

/**
 * packageName    : com.food.ordering.system.order.service.domain.event
 * fileName       : OrderPaidEvent
 * author         : limsooyoung
 * date           : 1/15/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/15/25        limsooyoung       최초 생성
 */
public class OrderPaidEvent extends OrderEvent {
    public OrderPaidEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
