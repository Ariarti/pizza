package com.company.pizza.core.role;

import com.company.pizza.entity.*;
import com.haulmont.cuba.security.app.role.AnnotatedRoleDefinition;
import com.haulmont.cuba.security.app.role.annotation.EntityAccess;
import com.haulmont.cuba.security.app.role.annotation.EntityAttributeAccess;
import com.haulmont.cuba.security.app.role.annotation.Role;
import com.haulmont.cuba.security.app.role.annotation.ScreenAccess;
import com.haulmont.cuba.security.entity.EntityOp;
import com.haulmont.cuba.security.role.EntityAttributePermissionsContainer;
import com.haulmont.cuba.security.role.EntityPermissionsContainer;
import com.haulmont.cuba.security.role.ScreenPermissionsContainer;

@Role(name = CourierRole.NAME)
public class CourierRole extends AnnotatedRoleDefinition {
    public final static String NAME = "Courier";

    @ScreenAccess(screenIds = {"application-pizza", "pizza_Pizza.browse", "pizza_Topping.browse", "pizza_Ingredient.browse", "pizza_Order.browse", "pizza_Item.browse", "pizza_Order.edit", "pizza_Delivery.browse", "pizza_Client.browse"})
    @Override
    public ScreenPermissionsContainer screenPermissions() {
        return super.screenPermissions();
    }

    @EntityAccess(entityClass = Client.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Delivery.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Pizza.class, operations = EntityOp.READ)
    @Override
    public EntityPermissionsContainer entityPermissions() {
        return super.entityPermissions();
    }

    @EntityAttributeAccess(entityClass = Client.class, view = {"name", "address", "phone", "email"})
    @EntityAttributeAccess(entityClass = Item.class, view = {"order", "pizza", "amount"})
    @EntityAttributeAccess(entityClass = Delivery.class, view = "*")
    @EntityAttributeAccess(entityClass = Order.class, modify = "status", view = {"number", "date", "costOrder", "delivery"})
    @EntityAttributeAccess(entityClass = Ingredient.class, view = {"pizza", "topping", "amount"})
    @EntityAttributeAccess(entityClass = Topping.class, view = {"name", "spicy"})
    @EntityAttributeAccess(entityClass = Pizza.class, view = {"name", "size", "price"})
    @Override
    public EntityAttributePermissionsContainer entityAttributePermissions() {
        return super.entityAttributePermissions();
    }
}
