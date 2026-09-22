-- LeetCode Problem: Combine Two Tables
-- Link: https://leetcode.com/problems/combine-two-tables/
-- Difficulty: Easy
-- Language: mysql

# Write your MySQL query statement below

select firstName,lastName,city, state from Person Left join Address
ON Person.personId = Address.personId;