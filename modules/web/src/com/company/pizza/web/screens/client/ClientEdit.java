package com.company.pizza.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizza.entity.Client;

@UiController("pizza_Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
@LoadDataBeforeShow
public class ClientEdit extends StandardEditor<Client> {
}