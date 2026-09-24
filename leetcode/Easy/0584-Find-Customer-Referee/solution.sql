-- LeetCode Problem: Find Customer Referee
-- Link: https://leetcode.com/problems/find-customer-referee/
-- Difficulty: Easy
-- Language: mysql

# Write your MySQL query statement below


# Write your MySQL query statement below
select name from customer where referee_id != 2 or referee_id is null;