with cte as(select * , distance_km/fuel_consumed as efficiency
from trips),

 cte2 as (select e1.driver_id , e2.driver_name ,avg(case when month(e1.trip_date) between 1 and 6 then e1.efficiency else null
end) as first_half ,avg(case when month(e1.trip_date) between 7 and 12 then e1.efficiency else null
end) as second_half
from cte e1 left join drivers e2 on
e1.driver_id = e2.driver_id
group by e1.driver_id , e2.driver_name)

select driver_id , driver_name , round(first_half,2) as first_half_avg, round(second_half,2) as second_half_avg ,round((second_half-first_half),2) as efficiency_improvement
from cte2 
where first_half < second_half
order by efficiency_improvement desc , driver_name