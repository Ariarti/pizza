package com.company.pizza.web.screens.delivery;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizza.entity.Delivery;

@UiController("pizza_Delivery.browse")
@UiDescriptor("delivery-browse.xml")
@LookupComponent("deliveriesTable")
@LoadDataBeforeShow
public class DeliveryBrowse extends StandardLookup<Delivery> {
}