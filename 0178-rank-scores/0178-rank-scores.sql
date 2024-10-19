# Write your MySQL query statement below
select s1.score, count(distinct s2.score) as 'rank' from scores s1 
join scores s2 on s1.score<=s2.score
group by s1.Id
order by s1.score desc;
