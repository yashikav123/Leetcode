# Write your MySQL query statement below
-- select c.name as Customers
-- from Customers c
-- left join Orders o
-- on c.id=o.customerId
-- where o.customerId is Null; 

select name as Customers from 
customers where id not in(select customerID from Orders);