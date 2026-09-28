# Write your MySQL query statement below
select 
    score,
    Dense_Rank() OVER (ORDER BY score DESC) as 'rank'
from Scores;