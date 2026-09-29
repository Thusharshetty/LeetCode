# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary
from Department as d
Left join Employee as e on e.departmentId=d.id
where (departmentId, salary) in (select departmentId,MAX(salary) from Employee group by departmentId );