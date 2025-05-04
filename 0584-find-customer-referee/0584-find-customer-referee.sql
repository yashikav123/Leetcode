# Write your MySQL query statement below
SELECT name 
FROM Customer 
WHERE referee_id !=2 OR referee_id is Null ;
# where consider null as unknown value
#because where class only return true and also it does not consider unknown value as true 