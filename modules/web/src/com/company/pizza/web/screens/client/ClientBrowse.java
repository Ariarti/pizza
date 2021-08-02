package com.company.pizza.web.screens.client;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizza.entity.Client;

@UiController("pizza_Client.browse")
@UiDescriptor("client-browse.xml")
@LookupComponent("clientsTable")
@LoadDataBeforeShow
public class ClientBrowse extends StandardLookup<Client> {
}