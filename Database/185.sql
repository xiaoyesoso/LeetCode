# Write your MySQL query statement below
select d.Name Department,e.name Employee,Salary
from Employee e,Department d
where DepartmentId = d.Id and (select count(distinct(e2.Salary))
                             from Employee e2
                             where e.DepartmentId = e2.DepartmentId and e.Salary < e2.Salary) < 3
order by d.Id,Salary desc;
