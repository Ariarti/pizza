package com.company.pizza.web.screens.delivery;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizza.entity.Delivery;

@UiController("pizza_Delivery.edit")
@UiDescriptor("delivery-edit.xml")
@EditedEntityContainer("deliveryDc")
@LoadDataBeforeShow
public class DeliveryEdit extends StandardEditor<Delivery> {
}