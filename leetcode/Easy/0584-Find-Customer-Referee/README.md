# Find Customer Referee

**Difficulty:** Easy  
**Topics:** Database  
**LeetCode URL:** [Find Customer Referee](https://leetcode.com/problems/find-customer-referee/)

## Problem Description

<p>Table: <code>Customer</code></p>

<pre>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| referee_id  | int     |
+-------------+---------+
In SQL, id is the primary key column for this table.
Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them.
</pre>

<p>&nbsp;</p>

<p>Find the names of the customer that are either:</p>

<ol>
	<li><strong>referred by</strong>&nbsp;any&nbsp;customer with&nbsp;<code>id != 2</code>.</li>
	<li><strong>not referred by</strong> any customer.</li>
</ol>

<p>Return the result table in <strong>any order</strong>.</p>

<p>The result format is in the following example.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> 
Customer table:
+----+------+------------+
| id | name | referee_id |
+----+------+------------+
| 1  | Will | null       |
| 2  | Jane | null       |
| 3  | Alex | 2          |
| 4  | Bill | null       |
| 5  | Zack | 1          |
| 6  | Mark | 2          |
+----+------+------------+
<strong>Output:</strong> 
+------+
| name |
+------+
| Will |
| Jane |
| Bill |
| Zack |
+------+
</pre>

## Constraints



## Solution

```mysql
-- LeetCode Problem: Find Customer Referee
-- Link: https://leetcode.com/problems/find-customer-referee/
-- Difficulty: Easy
-- Language: mysql

# Write your MySQL query statement below


# Write your MySQL query statement below
select name from customer where referee_id != 2 or referee_id is null;
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
