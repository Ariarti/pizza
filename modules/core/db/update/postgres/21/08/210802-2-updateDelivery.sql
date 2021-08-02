alter table PIZZA_DELIVERY rename column courier_id to courier_id__u71253 ;
drop index IDX_PIZZA_DELIVERY_ON_COURIER ;
alter table PIZZA_DELIVERY add column COURIER varchar(255) ^
update PIZZA_DELIVERY set COURIER = '' where COURIER is null ;
alter table PIZZA_DELIVERY alter column COURIER set not null ;
