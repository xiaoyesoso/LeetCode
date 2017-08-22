# Write your MySQL query statement below
select Department.Name Department,Employee.name Employee,Salary
from 
(
    select Department.Name,Max(Salary) maxs
    from Department,Employee
    where Employee.DepartmentId = Department.Id
    group by Department.Name
) tmp,Department,Employee
where tmp.Name = Department.Name and Employee.DepartmentId = Department.Id and Salary = maxs;
