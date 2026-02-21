-- set sql_safe_updates -- = 0; 
-- -- 1 - to chnage

-- select * from families;

update families
set doj = "2026-02-17" 
where emp_id=7;
select * from families;

update families
set doj = "2026-03-03";
select * from families;

update families
set phone_number = "8839939303"
where emp_id=7;
select * from families;

update families
set phone_number = null, doj =null
where emp_id=7;
select * from families;