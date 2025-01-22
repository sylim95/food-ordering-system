package com.food.ordering.system.order.service.domain.ports.output.repository;

import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

/**
 * packageName    : com.food.ordering.system.order.service.domain.ports.output.repository
 * fileName       : OrderRepository
 * author         : limsooyoung
 * date           : 1/22/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/22/25        limsooyoung       최초 생성
 */
public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
