##using self join as we give self join we need to use altername because we cant give two table name



select e1.name as Employee
from Employee e1
join Employee e2
on e1.managerId=e2.id
where e1.salary>e2.salary