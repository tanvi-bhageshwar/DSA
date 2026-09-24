-- LeetCode Problem: Big Countries
-- Link: https://leetcode.com/problems/big-countries/
-- Difficulty: Easy
-- Language: mysql

# Write your MySQL query statement below

select name,population,  area from World where area>=3000000 OR population >=25000000