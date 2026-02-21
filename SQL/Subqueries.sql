-- select avg(e_salary) from employees;

-- select e_id, e_name, e_salary from employees
-- where e_salary > 50000;

-- select avg(e_salary) from employees;

-- select e_id, e_name, e_salary from employees
-- where e_salary > (select avg(e_salary) from employees);

-- select e_name, e_salary from employees
-- where manager_id= 4;
-- select e_id from employees
-- where e_name="jayabalajee";

-- select e_name, e_salary from employees
-- where manager_id= (select e_id from employees
-- where e_name="jayabalajee");

-- select e_name, e_salary from employees
-- where manager_id= (select e_id from employees
-- where e_name="jayabalajee");

-- select e_id from employees
-- where e_name="jayabalajee" or e_name="jaya";

-- select * from employees
-- where manager_id in (select e_id from employees
-- where e_name="jayabalajee" or e_name="jaya");