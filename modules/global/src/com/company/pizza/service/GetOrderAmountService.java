package com.company.pizza.service;

import com.company.pizza.entity.Item;
import com.company.pizza.entity.Order;

import java.math.BigDecimal;

public interface GetOrderAmountService {
    String NAME = "pizza_GetOrderAountService";

    BigDecimal calculateOrder(Order order);
}