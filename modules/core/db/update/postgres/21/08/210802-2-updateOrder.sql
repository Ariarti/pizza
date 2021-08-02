alter table PIZZA_ORDER rename column status to status__u63199 ;
alter table PIZZA_ORDER rename column cost to cost__u38834 ;
alter table PIZZA_ORDER alter column cost__u38834 drop not null ;
alter table PIZZA_ORDER rename column number_ to number___u53536 ;
alter table PIZZA_ORDER alter column number___u53536 drop not null ;
alter table PIZZA_ORDER add column COST_ORDER decimal(19, 2) ;
alter table PIZZA_ORDER add column DATE_ timestamp ^
update PIZZA_ORDER set DATE_ = current_timestamp where DATE_ is null ;
alter table PIZZA_ORDER alter column DATE_ set not null ;
-- alter table PIZZA_ORDER add column NUMBER_ varchar(255) ^
-- update PIZZA_ORDER set NUMBER_ = <default_value> ;
-- alter table PIZZA_ORDER alter column number_ set not null ;
alter table PIZZA_ORDER add column NUMBER_ varchar(255) ;
alter table PIZZA_ORDER add column STATUS integer ^
update PIZZA_ORDER set STATUS = 10 where STATUS is null ;
alter table PIZZA_ORDER alter column STATUS set not null ;
