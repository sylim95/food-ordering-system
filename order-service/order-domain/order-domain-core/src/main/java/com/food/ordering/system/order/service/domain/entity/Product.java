package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.BaseEntity;
import com.food.ordering.system.domain.valueobject.Money;
import com.food.ordering.system.domain.valueobject.ProductId;

/**
 * packageName    : com.food.ordering.system.order.service.domain.entity
 * fileName       : Product
 * author         : limsooyoung
 * date           : 1/14/25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 1/14/25        limsooyoung       최초 생성
 */
public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;

    public Product(ProductId productId, String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public void updateWithConfirmedNameAndPrice(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
