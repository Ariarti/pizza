package com.company.pizza.service;

import com.company.pizza.entity.Payment;

import java.math.BigDecimal;

public interface GetPaymentAmountService {
    String NAME = "pizza_GetPaymentAmountService";

    BigDecimal getPaymentAmount(Payment payment);
}