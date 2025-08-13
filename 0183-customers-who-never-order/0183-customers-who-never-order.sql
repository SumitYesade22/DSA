# Write your MySQL query statement below
select name as Customers from Customers
where id not in 
(select e2.id
from Orders e1 left join Customers e2
on e2.id=e1.customerId)