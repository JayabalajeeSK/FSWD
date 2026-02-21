
insert into cust
values(4, "tharun",null);

select * from trans;
select * from cust;

select * from trans 
inner join cust
on trans.c_id = cust.c_id;

select * from trans 
left join cust
on trans.c_id = cust.c_id;

select * from trans 
right join cust
on trans.c_id = cust.c_id;