package com.food.ordering.system.domain.event.publisher;

import com.food.ordering.system.domain.event.DomainEvent;

/**
 * packageName    : com.food.ordering.system.domain.event.publisher
 * fileName       : DomainEventPublisher
 * author         : limsooyoung
 * date           : 1/22/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/22/25        limsooyoung       최초 생성
 */
public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
