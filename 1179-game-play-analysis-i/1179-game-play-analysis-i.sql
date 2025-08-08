# Write your MySQL query statement below
with cte as (select player_id ,dense_rank() over (partition by player_id order by event_date) as rnk , event_date
from Activity )

select player_id , event_date as first_login
from cte
where rnk=1
