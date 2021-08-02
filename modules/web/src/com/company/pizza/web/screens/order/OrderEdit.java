package com.company.pizza.web.screens.order;

import com.company.pizza.entity.Item;
import com.company.pizza.service.GetOrderAmountService;
import com.haulmont.cuba.gui.model.CollectionChangeType;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.pizza.entity.Order;

import javax.inject.Inject;

@UiController("pizza_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {

    @Inject
    private GetOrderAmountService getOrderAmountService;

    private void getAmount() {
        Order order = getEditedEntity();
        order.setCostOrder(getOrderAmountService.calculateOrder(order));
    }


    @Subscribe(id = "itemDc", target = Target.DATA_CONTAINER)
    public void onItemDcCollectionChange(CollectionContainer.CollectionChangeEvent<Item> event) {
        if (event.getChangeType() != CollectionChangeType.REFRESH) {
            getAmount();
        }
    }
}



    
    
    
    
