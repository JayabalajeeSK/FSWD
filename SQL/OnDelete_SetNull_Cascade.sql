-- select * from bills;

-- alter table bills
-- add column doctor_id int;

-- update bills
-- set doctor_id =5
-- where id =5;
-- select * from bills;

-- select * from employees;


-- alter table bills
-- add constraint fk_doct_id
-- foreign key(doctor_id) references employees(e_id);
-- select * from bills;

-- -- delete from employees
-- -- where e_id=1;

-- -- on delete set null
-- alter table bills
-- drop constraint fk_doct_id;

-- alter table bills
-- add constraint fk_doct_id
-- foreign key(doctor_id) references employees(e_id)
-- on delete set null;

-- delete from employees
-- where e_id=1;

-- select * from bills;
-- select * from employees;


-- -- on delete cascade
-- alter table bills
-- drop constraint fk_doct_id;

-- alter table bills
-- add constraint fk_doct_id
-- foreign key(doctor_id) references employees(e_id)
-- on delete cascade;

-- delete from employees
-- where e_id=2;

-- select * from bills;
-- select * from employees;