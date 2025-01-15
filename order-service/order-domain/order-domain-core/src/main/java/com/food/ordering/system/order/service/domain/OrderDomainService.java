package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.entity.Restaurant;
import com.food.ordering.system.order.service.domain.event.OrderCancelledEvent;
import com.food.ordering.system.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.order.service.domain.event.OrderPaidEvent;

import java.util.List;

/**
 * packageName    : com.food.ordering.system.order.service.domain
 * fileName       : OrderDomainService
 * author         : limsooyoung
 * date           : 1/15/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/15/25        limsooyoung       최초 생성
 */
public interface OrderDomainService {

    OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);

    void cancelOrder(Order order, List<String> failureMessages);
}
