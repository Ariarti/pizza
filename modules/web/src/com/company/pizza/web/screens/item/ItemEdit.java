package com.company.pizza.web.screens.item;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizza.entity.Item;

@UiController("pizza_Item.edit")
@UiDescriptor("item-edit.xml")
@EditedEntityContainer("itemDc")
@LoadDataBeforeShow
public class ItemEdit extends StandardEditor<Item> {
}