-- update PIZZA_DELIVERY set CLIENT_ID = <default_value> where CLIENT_ID is null ;
alter table PIZZA_DELIVERY alter column CLIENT_ID set not null ;
