-- select * from employees;

-- create view employee_salary as select e_name, e_salary from employees;
-- select * from employee_salary;

-- create view employee_salary as select e_name, e_salary from employees;
-- select * from employee_salary
-- where e_salary >50000;

-- insert into employees (e_name, e_age, e_salary, e_doj, manager_id)
-- value
-- ("jb", 23, 156666, "2025-09-08", 3);
-- select * from employee_salary; -- no data inconsistancy

-- create view reportsTo as
-- select a.e_name, a.e_salary, b.e_name as "manager" from employees a -- employees
-- inner join employees b -- manager
-- on a.manager_id = b.e_id;
-- select * from reportsTo;

-- drop view employee_salary;
-- drop view reportsTo;