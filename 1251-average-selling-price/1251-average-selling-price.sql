# Write your MySQL query statement below
select p.product_id,
round(ifnull(sum(price * units)/sum(units),0),2) average_price 
from UnitsSold u right join Prices p
on p.product_id=u.product_id
and purchase_date  between start_date and end_date

group by p.product_id