# Write your MySQL query statement below
select e1.name , sum(amount) as balance
from Users e1 left join Transactions e2
on e1.account = e2.account
group by e1.account
having sum(amount) > 10000