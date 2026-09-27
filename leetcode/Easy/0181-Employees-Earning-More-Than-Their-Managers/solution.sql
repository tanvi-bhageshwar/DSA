-- LeetCode Problem: Employees Earning More Than Their Managers
-- Link: https://leetcode.com/problems/employees-earning-more-than-their-managers/
-- Difficulty: Easy
-- Language: mysql

SELECT
    e.name AS Employee
FROM Employee e
JOIN Employee m
ON e.managerId = m.id
WHERE e.salary > m.salary;