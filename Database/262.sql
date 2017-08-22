# Write your MySQL query statement below
select Request_at Day,round(sum(case when Status = 'completed' then 0 else 1 end) / count(1) ,2) 'Cancellation Rate'
from Trips 
where Client_Id in
(
    select Users_Id
    from Users
    where Banned = 'No' and Role = 'client'
) and Request_at >= '2013-10-01' and Request_at <= '2013-10-03'
group by Request_at;
