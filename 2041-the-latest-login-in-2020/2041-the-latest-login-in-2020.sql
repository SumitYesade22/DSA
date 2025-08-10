# Write your MySQL query statement below
with cte as(select * , dense_rank() over (partition by user_id 
order by time_stamp desc) as rnk
from Logins
where date_format(time_stamp,'%Y') = '2020')

select user_id , time_stamp as last_stamp
from cte 
where rnk = 1
