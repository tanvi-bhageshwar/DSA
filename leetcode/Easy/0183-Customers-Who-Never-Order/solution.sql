-- LeetCode Problem: Customers Who Never Order
-- Link: https://leetcode.com/problems/customers-who-never-order/
-- Difficulty: Easy
-- Language: mysql

# Write your MySQL query statement below
SELECT name AS Customers
FROM Customers AS c
LEFT JOIN Orders AS o
ON c.id = o.customerId
WHERE customerId IS NULL;