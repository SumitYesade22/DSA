with cte as (select e1.student_id , e1.subject , e1.score as first_score, e2.score as latest_score , dense_rank() over (partition by e1.student_id , e1.subject 
order by e1.exam_date , e2.exam_date desc) as rnk
from Scores e1 left join Scores e2
on e1.student_id = e2.student_id
and e1.subject = e2.subject
where e1.exam_date < e2.exam_date
)

select student_id , subject ,  first_score ,  latest_score
from cte 
where rnk=1
and first_score < latest_score
