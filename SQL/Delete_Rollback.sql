select * from families;

delete from families
where emp_id = 7;
select * from families;

delete from families;
select * from families;

-- set autocommit =0;

rollback;

commit;

select * from families;

update families
set salary =0;

select * from families;

rollback;

select * from families;

update families
set salary =50000.00
where emp_id=6;
select * from families;
commit;
rollback;
select * from families;
