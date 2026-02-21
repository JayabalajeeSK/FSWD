-- create table cust
-- (
-- c_id int primary key auto_increment,
-- c_name varchar(40),
-- c_age int
-- );
-- insert into cust (c_name, c_age)
-- values
-- ("jaya", 23),
-- ("bala", 22);
-- select * from cust;

-- create table trans
-- (
-- t_id int primary key auto_increment,
-- amount decimal(6,2),
-- c_id int,
-- foreign key(c_id) references cust(c_id) -- not unique and not null and can null - but use contrains
-- );

-- insert into trans (amount, c_id)
-- values
-- (2300, 1),
-- (6000, 2),
-- (6000, 1);
-- select * from trans;

-- select * from cust;

-- alter table trans
-- drop foreign key trans_ibfk_1;
-- select * from trans;

-- alter table trans
-- add constraint fk_c_id
-- foreign key(c_id) references cust(c_id);
-- select * from trans;