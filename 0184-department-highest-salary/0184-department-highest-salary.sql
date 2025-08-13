# Write your MySQL query statement below
with cte as (select e2.name as Department , e1.name as Employee , salary,
dense_rank() over (partition by e2.name 
order by salary desc ) as rnk
from Employee e1
left join Department e2
on e1.departmentId = e2.id)

select Department , Employee , salary 
from cte 
where rnk = 1
