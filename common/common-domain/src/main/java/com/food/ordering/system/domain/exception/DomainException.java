package com.food.ordering.system.domain.exception;

/**
 * packageName    : com.food.ordering.system.domain.exception
 * fileName       : DomainException
 * author         : limsooyoung
 * date           : 1/15/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/15/25        limsooyoung       최초 생성
 */
public class DomainException extends RuntimeException {

    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
