-- select avg(e_salary), manager_id from employees
-- group by manager_id;

-- select avg(e_salary), manager_id from employees
-- group by manager_id with rollup;

-- select * from employees
-- order by e_doj;

-- select e_name, e_salary,
-- row_number() over(order by e_doj) AS row_num,
-- rank() over(order by e_doj) as "Rank",
-- dense_rank() over(order by e_doj) as "Dense Rank"
-- from employees;

-- select e_name, manager_id,
-- row_number() over(partition  by manager_id order by e_doj)
-- from employees;