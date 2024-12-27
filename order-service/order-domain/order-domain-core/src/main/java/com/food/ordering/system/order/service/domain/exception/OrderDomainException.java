package com.food.ordering.system.order.service.domain.exception;

import com.food.ordering.system.domain.execption.DomainException;

public class OrderDomainException extends DomainException {
    public OrderDomainException(String message) {
        super(message);
    }
    public OrderDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
