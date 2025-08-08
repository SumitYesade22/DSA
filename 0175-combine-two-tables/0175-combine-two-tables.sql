# Write your MySQL query statement below
select e1.firstName as firstName , e1.lastName as lastName , e2.city as city
,e2.state as state 
from Person e1 left join Address e2
on e1.personId = e2.personId