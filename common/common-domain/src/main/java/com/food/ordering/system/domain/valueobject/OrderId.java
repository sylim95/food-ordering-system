package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * packageName    : com.food.ordering.system.domain.valueobject
 * fileName       : OrderId
 * author         : limsooyoung
 * date           : 1/14/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/14/25        limsooyoung       최초 생성
 */
public class OrderId extends BaseId<UUID> {
    public OrderId(UUID value) {
        super(value);
    }
}
