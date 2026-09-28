# Write your MySQL query statement below
delete p
from person as p
join person as pe on p.email = pe.email and p.id>pe.id;