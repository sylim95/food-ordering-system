package com.food.ordering.system.order.service.domain.valueobject;

import com.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

/**
 * packageName    : com.food.ordering.system.order.service.domain.valueobject
 * fileName       : TrackingId
 * author         : limsooyoung
 * date           : 1/14/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/14/25        limsooyoung       최초 생성
 */
public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
