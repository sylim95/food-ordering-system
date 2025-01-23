package com.food.ordering.system.order.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

/**
 * packageName    : com.food.ordering.system.order.service.domain.exception
 * fileName       : OrderNotFoundException
 * author         : limsooyoung
 * date           : 1/23/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/23/25        limsooyoung       최초 생성
 */
public class OrderNotFoundException extends DomainException {

    public OrderNotFoundException(String message) {
        super(message);
    }

    public OrderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
