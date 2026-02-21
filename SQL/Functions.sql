-- create database rk_hospital;
-- use rk_hospital;
-- create table employees
-- (
-- e_id int primary key auto_increment,
-- e_name varchar(50) not null,
-- e_age int not null,
-- e_salary int
-- );
-- select * from employees;

-- desc employees;
-- describe employees;

-- insert into employees (e_name, e_age, e_salary)
-- values
-- ("jaya",23,100000),
-- ("bala",24,50000),
-- ("tharunbalajee",24,50000),
-- ("jayabalajee",25,5030000),
-- ("balajee",27,230000),
-- ("tharun",22,200000);

-- select * from employees;

-- select count(e_name) as emp_count from employees
-- where e_age>23;

-- select max(e_salary) as high_salary from employees
-- where e_age>23; -- optional

-- select min(e_salary) as low_salary from employees
-- where e_age>23; -- optional

-- select sum(e_salary) as total_salary from employees;

-- select avg(e_age) as avg_age from employees;

-- select concat(e_name,"@jvk", e_id) as usernames from employees;
