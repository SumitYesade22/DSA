with cte as
(select e2.employee_id , e2.employee_name , e2.department , week(meeting_date , 1) as weekday , case
when sum(duration_hours) > 20 then 1
else 0
end as countweek
from meetings e1 left join employees e2 
on e1.employee_id = e2.employee_id 
group by e1.employee_id , week(meeting_date, 1) )

select employee_id , employee_name , department , sum(countweek) as meeting_heavy_weeks
from cte
group by employee_id 
having sum(countweek) >= 2
order by meeting_heavy_weeks desc , employee_name