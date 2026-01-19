# Write your MySQL query statement below
select * from Cinema
where id%2<>0 and description not like "b%"
order by rating desc;