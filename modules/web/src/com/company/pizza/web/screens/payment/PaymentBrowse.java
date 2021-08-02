package com.company.pizza.web.screens.payment;

import com.company.pizza.service.GetPaymentAmountService;
import com.company.pizza.service.MoneyBackService;
import com.haulmont.cuba.gui.screen.*;
import com.company.pizza.entity.Payment;

import javax.inject.Inject;

@UiController("pizza_Payment.browse")
@UiDescriptor("payment-browse.xml")
@LookupComponent("paymentsTable")
@LoadDataBeforeShow
public class PaymentBrowse extends StandardLookup<Payment> {
}