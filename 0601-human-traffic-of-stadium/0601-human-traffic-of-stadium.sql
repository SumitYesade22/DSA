# Write your MySQL query statement below
with cte as (select e1.id as first , e2.id as second , e3.id as third
from Stadium e1 left join Stadium e2
on e1.id+1=e2.id
left join Stadium e3
on e2.id+1=e3.id
where e1.people >= 100 and e2.people >= 100 and e3.people >= 100)
,
cte2 as (select first from cte
union 
select second from cte
union
select third from cte)
select * from Stadium 
where id in (select first from cte2)