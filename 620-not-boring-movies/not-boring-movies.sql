# Write your MySQL query statement below
select id , movie , description , rating
from Cinema
where description not like 'boring'
group by id
having mod(id,2)!=0 
order by rating desc;

