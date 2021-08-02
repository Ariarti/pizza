alter table PIZZA_PIZZA rename column calorie to calorie__u89087 ;
alter table PIZZA_PIZZA alter column calorie__u89087 drop not null ;
alter table PIZZA_PIZZA rename column price to price__u43759 ;
alter table PIZZA_PIZZA alter column price__u43759 drop not null ;
alter table PIZZA_PIZZA add column PRICE decimal(19, 2) ^
update PIZZA_PIZZA set PRICE = 0 where PRICE is null ;
alter table PIZZA_PIZZA alter column PRICE set not null ;
alter table PIZZA_PIZZA add column CALORIE integer ^
update PIZZA_PIZZA set CALORIE = 0 where CALORIE is null ;
alter table PIZZA_PIZZA alter column CALORIE set not null ;
