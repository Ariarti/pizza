package com.company.pizza.service;

import com.company.pizza.entity.Payment;

public interface MoneyBackService {
    String NAME = "pizza_MoneyBackService";

    boolean moneyBack(Payment payment);
}