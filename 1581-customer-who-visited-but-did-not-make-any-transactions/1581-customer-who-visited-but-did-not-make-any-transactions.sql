# Write your MySQL query statement below
SELECT v. customer_id,count(*) AS count_no_trans
from Visits v 
LEFT JOIN Transactions T ON v.visit_id=t.visit_id
where transaction_id is Null
group by v.customer_id;