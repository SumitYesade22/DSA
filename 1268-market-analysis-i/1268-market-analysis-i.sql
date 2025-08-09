# Write your MySQL query statement below
select e1.user_id as buyer_id , e1.join_date , sum(case
when date_format(e2.order_date,'%Y')='2019' then 1 else 0 end) as orders_in_2019
from Users e1 left join Orders e2
on e1.user_id = e2.buyer_id
group by user_id 
