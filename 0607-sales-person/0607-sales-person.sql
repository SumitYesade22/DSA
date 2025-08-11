# Write your MySQL query statement below
with cte as (select e1.sales_id 
from Orders e1 left join Company e2
on e1.com_id = e2.com_id
where e2.name = 'RED')
select name 
from SalesPerson
where sales_id not in (select sales_id from cte)