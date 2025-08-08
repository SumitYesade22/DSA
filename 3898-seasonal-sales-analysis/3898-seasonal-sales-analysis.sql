# Write your MySQL query statement below
with cte as 
(select e1.* , e2.category , case
when month(e1.sale_date) in (12,1,2) then 'Winter'
when month(e1.sale_date) in (3,4,5) then 'Spring'
when month(e1.sale_date) in (6,7,8) then 'Summer'
else 'Fall'
end as season
from sales e1
left join products e2
on e1.product_id = e2.product_id)
,
cte2 as 
(select category ,season, sum(quantity) as total_quantity , sum(quantity*price) as total_revenue
from cte 
group by category , season
)

,cte3 as (select * , row_number() over ( partition by season  order by total_quantity desc , total_revenue desc) as new
from cte2)

select season , category , total_quantity , total_revenue
from cte3
where new = 1
