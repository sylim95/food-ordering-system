package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * packageName    : com.food.ordering.system.domain.valueobject
 * fileName       : RestaurantId
 * author         : limsooyoung
 * date           : 1/14/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/14/25        limsooyoung       최초 생성
 */
public class RestaurantId extends BaseId<UUID> {
    public RestaurantId(UUID value) {
        super(value);
    }
}
