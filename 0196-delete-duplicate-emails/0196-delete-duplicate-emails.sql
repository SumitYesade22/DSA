# Write your MySQL query statement below
delete e1
from Person e1 inner join Person e2
on e1.email = e2.email
where e1.id > e2.id


