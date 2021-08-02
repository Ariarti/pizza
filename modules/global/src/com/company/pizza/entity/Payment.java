package com.company.pizza.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "PIZZA_PAYMENT")
@Entity(name = "pizza_Payment")
@NamePattern("%s %s|order,amount")
public class Payment extends StandardEntity {
    private static final long serialVersionUID = -7417323547980181566L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ORDER_ID")
    @NotNull
    private Order order;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    private BigDecimal amount;

    @Column(name = "MONEY_BACK")
    private Boolean refund;

    public Boolean getRefund() {
        return refund;
    }

    public void setRefund(Boolean refund) {
        this.refund = refund;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}