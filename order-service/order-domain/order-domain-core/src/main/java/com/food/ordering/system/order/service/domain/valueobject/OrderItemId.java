package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BaseId;

/**
 * packageName    : com.food.ordering.system.order.service.domain.valueobject
 * fileName       : OrderItemId
 * author         : limsooyoung
 * date           : 1/14/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/14/25        limsooyoung       최초 생성
 */
public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
