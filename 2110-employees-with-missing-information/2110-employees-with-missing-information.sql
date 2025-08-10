select e1.employee_id
from Employees e1 left join Salaries e2
on e1.employee_id = e2.employee_id
where e2.employee_id is null
union
select e2.employee_id
from Employees e1 right join Salaries e2
on e1.employee_id = e2.employee_id
where e1.employee_id is null
order by employee_id