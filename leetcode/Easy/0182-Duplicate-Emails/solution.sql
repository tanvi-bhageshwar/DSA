-- LeetCode Problem: Duplicate Emails
-- Link: https://leetcode.com/problems/duplicate-emails/
-- Difficulty: Easy
-- Language: mysql

# Write your MySQL query statement below
select  email from Person group by email having count(email)>1;