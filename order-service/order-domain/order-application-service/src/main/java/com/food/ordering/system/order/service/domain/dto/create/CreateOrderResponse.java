package com.food.ordering.system.order.service.domain.dto.create;

import com.food.ordering.system.domain.valueobject.OrderStatus;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

/**
 * packageName    : com.food.ordering.system.order.service.domain.dto.create
 * fileName       : CreateOrderResponse
 * author         : limsooyoung
 * date           : 1/22/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/22/25        limsooyoung       최초 생성
 */
@Getter
@Builder
@AllArgsConstructor
public class CreateOrderResponse {
    @NotNull
    private final UUID orderTrackingId;
    @NotNull
    private final OrderStatus orderStatus;
    @NotNull
    private final String message;
}
