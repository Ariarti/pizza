-- update PIZZA_PAYMENT set ORDER_ID = <default_value> where ORDER_ID is null ;
alter table PIZZA_PAYMENT alter column ORDER_ID set not null ;
