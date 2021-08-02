alter table PIZZA_PAYMENT rename column amount to amount__u44206 ;
alter table PIZZA_PAYMENT add column AMOUNT decimal(19, 2) ^
update PIZZA_PAYMENT set AMOUNT = 0 where AMOUNT is null ;
alter table PIZZA_PAYMENT alter column AMOUNT set not null ;
