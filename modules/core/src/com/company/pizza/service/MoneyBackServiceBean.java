package com.company.pizza.service;

import com.company.pizza.entity.Payment;
import org.springframework.stereotype.Service;

@Service(MoneyBackService.NAME)
public class MoneyBackServiceBean implements MoneyBackService {

    @Override
    public boolean moneyBack(Payment payment) {
        boolean refund = false;
        if (payment.getOrder().getStatus().getId().equals(70)) {
            refund = true;
        }
        return refund;
    }
}