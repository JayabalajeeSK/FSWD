
select emp_id, salary from families;
select emp_id as Employee_ID, salary as Employee_Salary from families;

select salary, emp_id from families;

select * from families 
where emp_id=2;

select * from families 
where salary>50000;

select * from families 
where doj is null;

select * from families 
where doj is not null;

select * from families 
where doj > "2026-03-03";


