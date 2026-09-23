# Repeated DNA Sequences

**Difficulty:** Medium  
**Topics:** Hash Table, String, Bit Manipulation, Sliding Window, Rolling Hash, Hash Function, Z Algorithm, Boyer–Moore String-Search Algorithm  
**LeetCode URL:** [Repeated DNA Sequences](https://leetcode.com/problems/repeated-dna-sequences/)

## Problem Description

<p>The <strong>DNA sequence</strong> is composed of a series of nucleotides abbreviated as <code>&#39;A&#39;</code>, <code>&#39;C&#39;</code>, <code>&#39;G&#39;</code>, and <code>&#39;T&#39;</code>.</p>

<ul>
	<li>For example, <code>&quot;ACGAATTCCG&quot;</code> is a <strong>DNA sequence</strong>.</li>
</ul>

<p>When studying <strong>DNA</strong>, it is useful to identify repeated sequences within the DNA.</p>

<p>Given a string <code>s</code> that represents a <strong>DNA sequence</strong>, return all the <strong><code>10</code>-letter-long</strong> sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in <strong>any order</strong>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
<strong>Output:</strong> ["AAAAACCCCC","CCCCCAAAAA"]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> s = "AAAAAAAAAAAAA"
<strong>Output:</strong> ["AAAAAAAAAA"]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>5</sup></code></li>
	<li><code>s[i]</code> is either <code>&#39;A&#39;</code>, <code>&#39;C&#39;</code>, <code>&#39;G&#39;</code>, or <code>&#39;T&#39;</code>.</li>
</ul>

## Solution

```java
// LeetCode Problem: Repeated DNA Sequences
// Link: https://leetcode.com/problems/repeated-dna-sequences/
// Difficulty: Medium
// Language: java

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
       
        List<String> ans=new ArrayList<>();
         if( s.length()<10) return ans;

        HashMap<String,Integer> map=new HashMap<>();
        int n=s.length();

        for(int i=0;i<=n-10;i++){

            String sub=s.substring(i,i+10);
            int count=map.getOrDefault(sub,0)+1;
            map.put(sub,count);

            if(count==2) {
                ans.add(sub);
            }
        }

return ans;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
