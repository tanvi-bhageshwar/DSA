# Reverse Integer

**Difficulty:** Medium  
**Topics:** Math  
**LeetCode URL:** [Reverse Integer](https://leetcode.com/problems/reverse-integer/)

## Problem Description

<p>Given a signed 32-bit integer <code>x</code>, return <code>x</code><em> with its digits reversed</em>. If reversing <code>x</code> causes the value to go outside the signed 32-bit integer range <code>[-2<sup>31</sup>, 2<sup>31</sup> - 1]</code>, then return <code>0</code>.</p>

<p><strong>Assume the environment does not allow you to store 64-bit integers (signed or unsigned).</strong></p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> x = 123
<strong>Output:</strong> 321
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> x = -123
<strong>Output:</strong> -321
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> x = 120
<strong>Output:</strong> 21
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>-2<sup>31</sup> &lt;= x &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

## Solution

```java
// LeetCode Problem: Reverse Integer
// Link: https://leetcode.com/problems/reverse-integer/
// Difficulty: Medium
// Language: java

class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);  // Original number ka absolute value nikala
        
        int rev = 0;  // Reversed number
        
        while (num != 0) {
            int ld = num % 10;  // Last digit nikala
            
            // Overflow check
            if (rev > (Integer.MAX_VALUE - ld) / 10) {
                return 0;  // Agar overflow hua, toh 0 return kardo
            }
            
            rev = rev * 10 + ld;  // Reverse mein digit ko add kiya
            num = num / 10;  // Last digit hata diya, next iteration ke liye
        }
        
        return (x < 0) ? (-rev) : rev;  // Original number ke sign ke hisaab se result diya
    }
}

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
