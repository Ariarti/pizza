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

@Role(name = CookRole.NAME)
public class CookRole extends AnnotatedRoleDefinition {
    public final static String NAME = "Cook";

    @ScreenAccess(screenIds = {"application-pizza", "pizza_Pizza.browse", "pizza_Topping.browse", "pizza_Ingredient.browse", "pizza_Order.browse", "pizza_Item.browse", "pizza_Pizza.edit", "pizza_Topping.edit", "pizza_Ingredient.edit", "pizza_Order.edit", "pizza_Item.edit"})
    @Override
    public ScreenPermissionsContainer screenPermissions() {
        return super.screenPermissions();
    }

    @EntityAccess(entityClass = Order.class, operations = {EntityOp.READ, EntityOp.UPDATE})
    @EntityAccess(entityClass = Item.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Ingredient.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = Topping.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = Pizza.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @Override
    public EntityPermissionsContainer entityPermissions() {
        return super.entityPermissions();
    }

    @EntityAttributeAccess(entityClass = Order.class, modify = "status", view = {"date", "item", "number"})
    @EntityAttributeAccess(entityClass = Item.class, view = "*")
    @EntityAttributeAccess(entityClass = Ingredient.class, modify = "*")
    @EntityAttributeAccess(entityClass = Topping.class, modify = "*")
    @EntityAttributeAccess(entityClass = Pizza.class, modify = "*")
    @Override
    public EntityAttributePermissionsContainer entityAttributePermissions() {
        return super.entityAttributePermissions();
    }
}
