alter table PIZZA_CLIENT add column ADDRESS varchar(255) ^
update PIZZA_CLIENT set ADDRESS = '' where ADDRESS is null ;
alter table PIZZA_CLIENT alter column ADDRESS set not null ;
alter table PIZZA_CLIENT alter column NAME drop not null ;
