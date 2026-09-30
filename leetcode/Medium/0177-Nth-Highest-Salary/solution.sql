-- LeetCode Problem: Nth Highest Salary
-- Link: https://leetcode.com/problems/nth-highest-salary/
-- Difficulty: Medium
-- Language: mysql

CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET N = N - 1;
    RETURN (
        SELECT DISTINCT salary
        FROM Employee
        ORDER BY salary DESC
        LIMIT 1 OFFSET N
    );
END