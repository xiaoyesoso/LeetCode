# Write your MySQL query statement below
select a.Id
from Weather a,Weather b
where TO_DAYS(a.Date)=TO_DAYS(b.Date)+1 and a.Temperature > b.Temperature;
