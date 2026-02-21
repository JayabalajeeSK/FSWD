-- SET SQL_SAFE_UPDATES = 0;

-- update employees
-- set e_doj = '2026-03-03';

-- select * from employees;

-- alter table employees
-- add manager_id int;
-- select * from employees;

-- update employees
-- set manager_id = 3
-- where e_id = 6;
-- select * from employees;

-- -- like hierarchical
-- select * from employees a
-- inner join employees b
-- on a.manager_id = b.e_id;

-- select a.e_id, a.e_name, a.e_salary, b.e_name as "manager" from employees a -- employees
-- inner join employees b -- manager
-- on a.manager_id = b.e_id;

-- select a.e_id, a.e_name, a.e_salary, b.e_name as "manager" from employees a -- employees
-- left join employees b -- manager
-- on a.manager_id = b.e_id;

-- select a.e_id, a.e_name, a.e_salary, b.e_name as "manager" from employees a -- employees
-- right join employees b -- manager
-- on a.manager_id = b.e_id;