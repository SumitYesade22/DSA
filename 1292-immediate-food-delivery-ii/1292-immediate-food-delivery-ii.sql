# Write your MySQL query statement below
with cte as 
(select * ,  dense_rank() over (
    partition by customer_id 
     order by order_date 
) as order_rank
from Delivery
)
select round(count(*)*100/(select count(*)
from cte
where order_rank=1),2) as immediate_percentage
from cte
where order_date = customer_pref_delivery_date and order_rank=1
