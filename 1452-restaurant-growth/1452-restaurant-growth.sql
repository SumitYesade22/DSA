# Write your MySQL query statement below
with cte as
(select visited_on , sum(amount) as total_amount
from Customer
group by visited_on )

select visited_on , sum(total_amount) over (order by visited_on 
rows between 6 preceding and current row) as amount  ,
round(avg(total_amount) over (order by visited_on 
rows between 6 preceding and current row),2) as average_amount
from cte
limit 18446744073709551615 offset 6