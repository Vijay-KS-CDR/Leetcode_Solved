# Write your MySQL query statement 
delete p from person p join person s on 
p.email = s.email
where p.id>s.id