# Write your MySQL query statement below
select Score,(select count(1)+1
                from (select distinct Score ss
                        from Scores
                     ) tmp
                where ss > Score
              ) Rank
from Scores
order by Score desc
