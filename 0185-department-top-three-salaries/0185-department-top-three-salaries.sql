with cte as (select e1.name as Employee , e2.name as Department , salary , dense_rank() over ( partition by e1.departmentId
order by salary desc ) as rnk
from Employee e1 left join Department e2
on e1.departmentId = e2.id)

select Department ,  Employee  ,salary
from cte 
where rnk = 1 or rnk= 2 or rnk = 3