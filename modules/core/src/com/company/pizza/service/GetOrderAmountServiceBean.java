package com.company.pizza.service;

import com.company.pizza.entity.Item;
import com.company.pizza.entity.Order;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service(GetOrderAmountService.NAME)
public class GetOrderAmountServiceBean implements GetOrderAmountService {

    public BigDecimal calculateOrder(Order order) {
        BigDecimal amount = BigDecimal.ZERO;

        if (order.getItem() != null) {
            for(Item item : order.getItem()) {
                amount = amount.add(BigDecimal.valueOf(item.getAmount()).multiply(item.getPizza().getPrice()));
            }
        }
        return amount;
    }
}