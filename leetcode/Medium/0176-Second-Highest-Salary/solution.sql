-- LeetCode Problem: Second Highest Salary
-- Link: https://leetcode.com/problems/second-highest-salary/
-- Difficulty: Medium
-- Language: mysql

# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);