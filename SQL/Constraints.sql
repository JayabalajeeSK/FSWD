-- create table products
-- (
-- p_id int primary key,
-- p_name varchar(30) unique,
-- p_price decimal(6,2)
-- );

-- insert into products
-- values
-- (1, "rice",350.75),
-- (2, "peanut",350.75);

-- select * from products;

-- -- alter table products
-- -- add constraint unique(p_name);

-- drop table products;

-- create table products
-- (
-- p_id int primary key,
-- p_name varchar(30) not null,
-- p_price decimal(6,2)
-- );

-- insert into products
-- value
-- (1, "rice",350.75),
-- (2,"peanuts",350.75);
-- select * from products;

-- create table products1
-- (
-- p_id int auto_increment primary key ,
-- p_name varchar(30) unique,
-- p_price decimal(6,2)
-- );


-- INSERT INTO products1 (p_name, p_price)
-- VALUES ('millets', 400.00);
-- select * from products1;

-- -- alter table 
-- -- modify column emailid varchar(105)
-- -- first;
-- -- select * from families;

-- drop table products1;

-- create table products1
-- (
-- p_id int primary key ,
-- p_name varchar(30) ,
-- p_price decimal(6,2)
-- constraint check_price check(p_price <100)
-- );

-- INSERT INTO products1 
-- VALUES 
-- (1, 'millets', 99.00),
-- (2, 'boost', 79.00),
-- (3, 'milk', 30.00),
-- (4, 'ice cream', 90.00),
-- (5, 'chcolate', 12.00);
-- select * from products1;

-- alter table products1
-- drop constraint check_price;
-- INSERT INTO products1 
-- VALUES 
-- (6, 'apple', 230.00),
-- (7, 'coconut oil', 120.00);
-- select * from products1;

-- alter table products1
-- add constraint check_price check(p_price<=230);

-- drop table products1;
-- create table products1
-- (
-- p_id int primary key ,
-- p_name varchar(30) ,
-- p_price decimal(6,2) 
-- );

-- alter table products1
-- -- alter p_price set default 10;

-- INSERT INTO products1 (p_id, p_name)
-- VALUES 
-- (1, 'boost'),
-- (2, 'chcolate');
-- select * from products1;

-- drop table products1;
-- create table products1
-- (
-- p_id int primary key ,
-- p_name varchar(30) ,
-- p_price decimal(6,2) default 10
-- );

-- INSERT INTO products1 (p_id, p_name)
-- VALUES 
-- (1, 'boost'),
-- (2, 'chcolate');
-- select * from products1;