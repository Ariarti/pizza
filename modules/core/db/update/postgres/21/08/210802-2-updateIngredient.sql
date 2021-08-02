alter table PIZZA_INGREDIENT rename column quantity to quantity__u28229 ;
alter table PIZZA_INGREDIENT alter column quantity__u28229 drop not null ;
alter table PIZZA_INGREDIENT add column AMOUNT integer ^
update PIZZA_INGREDIENT set AMOUNT = 0 where AMOUNT is null ;
alter table PIZZA_INGREDIENT alter column AMOUNT set not null ;
-- alter table PIZZA_INGREDIENT add column PIZZA_ID uuid ^
-- update PIZZA_INGREDIENT set PIZZA_ID = <default_value> ;
-- alter table PIZZA_INGREDIENT alter column PIZZA_ID set not null ;
alter table PIZZA_INGREDIENT add column PIZZA_ID uuid not null ;
-- alter table PIZZA_INGREDIENT add column TOPPING_ID uuid ^
-- update PIZZA_INGREDIENT set TOPPING_ID = <default_value> ;
-- alter table PIZZA_INGREDIENT alter column TOPPING_ID set not null ;
alter table PIZZA_INGREDIENT add column TOPPING_ID uuid not null ;
