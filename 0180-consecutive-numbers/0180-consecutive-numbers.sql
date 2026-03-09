# Write your MySQL query statement below
-- select distinct num as consecutiveNums
-- from(
-- select num,lead(num,1) over() as next1,
-- lead(num,2) over() as next2,
-- from logs;
-- ) t
-- where num=next1
-- and num=next2;

select distinct l1.num as ConsecutiveNums
from logs l1
join logs l2 on l1.id=l2.id-1
join logs l3 on l1.id=l3.id-2
where l1.num=l2.num
and l2.num=l3.num;