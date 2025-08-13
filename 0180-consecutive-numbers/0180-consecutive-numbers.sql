select  distinct e1.num as ConsecutiveNums
from Logs e1
left join Logs e2
on e1.num=e2.num and e1.id+1=e2.id
left join Logs e3
on e2.num = e3.num and e2.id+1=e3.id
where e1.num=e2.num and e2.num=e3.num 
