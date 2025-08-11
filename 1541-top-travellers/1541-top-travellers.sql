# Write your MySQL query statement below
select e2.name , ifnull(sum(e1.distance),0) as travelled_distance
from Rides e1 right join Users e2
on
e1.user_id = e2.id
group by e1.user_id , e2.name
order by sum(e1.distance) desc , e2.name 