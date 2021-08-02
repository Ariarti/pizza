package com.company.pizza.web.screens.item;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizza.entity.Item;

@UiController("pizza_Item.browse")
@UiDescriptor("item-browse.xml")
@LookupComponent("itemsTable")
@LoadDataBeforeShow
public class ItemBrowse extends StandardLookup<Item> {
}