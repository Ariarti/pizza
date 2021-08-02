package com.company.pizza.web.screens.payment;

import com.company.pizza.entity.Order;
import com.company.pizza.service.GetPaymentAmountService;
import com.company.pizza.service.MoneyBackService;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.pizza.entity.Payment;

import javax.inject.Inject;

@UiController("pizza_Payment.edit")
@UiDescriptor("payment-edit.xml")
@EditedEntityContainer("paymentDc")
@LoadDataBeforeShow
public class PaymentEdit extends StandardEditor<Payment> {

    @Inject
    private GetPaymentAmountService getPaymentAmountService;
    @Inject
    private MoneyBackService moneyBackService;

    void getAmount() {
        Payment payment = getEditedEntity();
        payment.setAmount(getPaymentAmountService.getPaymentAmount(payment));
    }

    void setBack() {
        Payment payment = getEditedEntity();
        payment.setRefund(moneyBackService.moneyBack(payment));
    }

    @Subscribe("orderField")
    public void onOrderFieldValueChange(HasValue.ValueChangeEvent<Order> event) {
        if (event.getValue().getStatus().getId() != null) {
            getAmount();
            setBack();
        }
    }






}