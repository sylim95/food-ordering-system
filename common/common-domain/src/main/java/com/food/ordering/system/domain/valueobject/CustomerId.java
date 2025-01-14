package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * packageName    : com.food.ordering.system.domain.valueobject
 * fileName       : CustomerId
 * author         : limsooyoung
 * date           : 1/14/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/14/25        limsooyoung       최초 생성
 */
public class CustomerId extends BaseId<UUID> {
    public CustomerId(UUID value) {
        super(value);
    }
}
