# Write your MySQL query statement below
select e1.request_at as Day, round(sum(case when e1.status like 'cancelled%' then 1 else 0 end)/count(*),2) as
'Cancellation Rate'
from Trips e1 left join Users e2
on e1.client_id = e2.users_id
left join Users e3
on e1.driver_id = e3.users_id
where e2.banned = 'No' and e3.banned = 'No'
and request_at between '2013-10-01' and '2013-10-03'
group by request_at
order by request_at