-- LeetCode Problem: Article Views I
-- Link: https://leetcode.com/problems/article-views-i/
-- Difficulty: Easy
-- Language: mysql

# Write your MySQL query statement below


 select distinct author_id as id from Views where author_id=viewer_id order by id; 