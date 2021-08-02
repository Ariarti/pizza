package com.company.pizza.service;

import com.company.pizza.entity.Payment;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service(GetPaymentAmountService.NAME)
public class GetPaymentAmountServiceBean implements GetPaymentAmountService {

    @Override
    public BigDecimal getPaymentAmount(Payment payment) {
        BigDecimal amount = BigDecimal.ZERO;

        if (payment.getOrder() != null && (payment.getOrder().getStatus().getId() >= 30)) {
            amount = amount.add(payment.getOrder().getCostOrder());
        }
        return amount;
    }
}