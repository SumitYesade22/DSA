# Write your MySQL query statement below
with cte as(select e1.product_id as product1_id , e2.product_id as product2_id , count(*) as customer_count
from ProductPurchases e1 left join ProductPurchases e2
on e1.user_id = e2.user_id
where e1.product_id < e2.product_id
group by e1.product_id , e2.product_id
having count(*) >= 3 )
select t1.product1_id , t1.product2_id , t2.category as product1_category , t3.category as product2_category , t1.customer_count
from cte t1 left join ProductInfo t2
on t1.product1_id = t2.product_id
left join ProductInfo t3
on  t1.product2_id = t3.product_id
order by t1.customer_count desc , t1.product1_id , t1.product2_id