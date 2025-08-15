# Write your MySQL query statement below
select e2.product_name , sum(e1.unit) as unit
from Orders e1 left join Products e2
on e1.product_id=e2.product_id
where date_format(order_date,'%Y-%m') = '2020-02' 
group by e1.product_id
having sum(e1.unit) >= 100