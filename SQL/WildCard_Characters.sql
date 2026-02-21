alter table employees
add e_doj date;

update employees
set e_doj="2026-03-10"
where e_id=9;

select * from employees
where e_name like "J%";

select * from employees
where e_doj like "2026%";

select * from employees
where e_name like "%ee";

select * from employees
where e_name like "_________ee";

select * from employees
where e_doj like "____-03___";

select * from employees
where e_doj like "_______-03";

select * from employees
where e_doj like "____-03-%";
select * from employees;