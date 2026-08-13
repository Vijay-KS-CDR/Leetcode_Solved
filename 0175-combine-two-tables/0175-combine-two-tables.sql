# Write your MySQL query statement below
select f.firstname,f.lastname, s.city,s.state from person f left join address s on f.personId = s.personId;