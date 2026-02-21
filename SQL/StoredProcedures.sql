-- delimiter //
-- create procedure get_employees()
-- begin
-- 	select * from employees;
-- end//
-- delimiter ;

-- call get_employees();

-- delimiter //
-- create procedure get_employees_by_id(in id int)
-- begin
-- 	select * from employees
--     where e_id = id;
-- end//
-- delimiter ;

-- call get_employees_by_id(3);

-- delimiter //
-- create procedure get_employees_by_id_age(in id int, in age int)
-- begin
-- 	select * from employees
--     where e_id = id and e_age=age;
-- end//
-- delimiter ;

-- call get_employees_by_id_age(3,24);

-- drop procedure get_employees_by_id_age;

-- delimiter //
-- create procedure count_employees(out e_count int)
-- begin
-- 	select count(e_name) into e_count from employees;
-- end//
-- delimiter ;

-- call count_employees(@e_count);
-- select @e_count;