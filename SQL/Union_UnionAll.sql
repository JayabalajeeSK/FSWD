-- create table bills
-- (
-- id int primary key auto_increment,
-- name varchar(30),
-- amount int
-- );
-- insert into bills (name, amount)
-- values
-- ("jaya", 2500),
-- ("bala", 1500),
-- ("tharun", 1000);
-- select * from bills;



-- create table expenses
-- (
-- id int primary key auto_increment,
-- name varchar(30),
-- amount int
-- );
-- insert into expenses (name, amount)
-- values
-- ("salary", 150000),
-- ("supplies", 10000),
-- ("Electricity Bill", 100000);
-- select * from expenses;

-- select * from bills
-- union
-- select * from expenses;

-- select * from employees;

-- select * from bills
-- union
-- select * from expenses;

-- select e_name, e_age from employees
-- union
-- select name, amount from bills;


-- update bills
-- set amount = 1500000
-- where id = 1;

-- update employees
-- set e_salary = 1500000
-- where e_id = 1;

-- select e_name, e_salary from employees
-- union -- not all duplicates
-- select name, amount from bills;

-- select e_name, e_salary from employees
-- union all -- allow duplicates
-- select name, amount from bills;