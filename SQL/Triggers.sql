-- select * from employees;
-- delimiter //
-- create trigger before_insert_employee
-- before insert on employees
-- for each row 
-- begin
-- 	set new.e_salary = ifnull(new.e_salary, 25000);
-- end//
-- delimiter ;

-- insert into employees (e_id, e_name, e_age)
-- values(1, "jaya", 23);

-- delimiter //
-- create trigger before_update_employee
-- before update on employees
-- for each row 
-- begin
-- 	set new.e_salary = old.e_salary * 1.10;
-- end//
-- delimiter ;

-- update employees set e_salary = 20000 where e_id =1;
-- select * from employees;
