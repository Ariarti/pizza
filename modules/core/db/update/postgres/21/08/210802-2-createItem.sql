alter table PIZZA_ITEM add constraint FK_PIZZA_ITEM_ON_ORDER foreign key (ORDER_ID) references PIZZA_ORDER(ID);
alter table PIZZA_ITEM add constraint FK_PIZZA_ITEM_ON_PIZZA foreign key (PIZZA_ID) references PIZZA_PIZZA(ID);
create index IDX_PIZZA_ITEM_ON_ORDER on PIZZA_ITEM (ORDER_ID);
create index IDX_PIZZA_ITEM_ON_PIZZA on PIZZA_ITEM (PIZZA_ID);
