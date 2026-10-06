-- LeetCode Problem: Calculate Special Bonus
-- Link: https://leetcode.com/problems/calculate-special-bonus/
-- Difficulty: Easy
-- Language: mysql


SELECT
    employee_id,
    CASE
        WHEN employee_id % 2 = 1
             AND name NOT LIKE 'M%'
        THEN salary
        ELSE 0
    END AS bonus
FROM Employees
ORDER BY employee_id;