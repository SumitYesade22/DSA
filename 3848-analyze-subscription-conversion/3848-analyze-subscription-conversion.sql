# Write your MySQL query statement below
with cte as (select user_id , round(avg(activity_duration),2) as trial_avg_duration 
from UserActivity
where activity_type = 'free_trial'
group by user_id),
cte2 as (select user_id , round(avg(activity_duration),2) as paid_avg_duration 
from UserActivity
where activity_type = 'paid'
group by user_id)
select e1.user_id , e1.trial_avg_duration , e2.paid_avg_duration 
from cte e1 inner join cte2 e2
on e1.user_id = e2.user_id
order by e1.user_id 