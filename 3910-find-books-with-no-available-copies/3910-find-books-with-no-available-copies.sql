# Write your MySQL query statement below
with cte as (select book_id , count(*) as countofbooks
from borrowing_records
where return_date is null
group by book_id)

select e1.book_id , e1.title , e1.author , e1.genre , e1.publication_year , countofbooks as current_borrowers 
from library_books e1 left join cte e2
on e1.book_id = e2.book_id
where total_copies-countofbooks=0
order by current_borrowers desc , e1.title 