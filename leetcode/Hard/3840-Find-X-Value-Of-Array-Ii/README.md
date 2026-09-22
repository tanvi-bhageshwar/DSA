# Find X Value of Array II

**Difficulty:** Hard  
**Topics:** Array, Math, Segment Tree  
**LeetCode URL:** [Find X Value of Array II](https://leetcode.com/problems/find-x-value-of-array-ii/)

## Problem Description

<p>You are given an array of <strong>positive</strong> integers <code>nums</code> and a <strong>positive</strong> integer <code>k</code>. You are also given a 2D array <code>queries</code>, where <code>queries[i] = [index<sub>i</sub>, value<sub>i</sub>, start<sub>i</sub>, x<sub>i</sub>]</code>.</p>

<p>You are allowed to perform an operation <strong>once</strong> on <code>nums</code>, where you can remove any <strong>suffix</strong> from <code>nums</code> such that <code>nums</code> remains <strong>non-empty</strong>.</p>

<p>The <strong>x-value</strong> of <code>nums</code> <strong>for a given</strong> <code>x</code> is defined as the number of ways to perform this operation so that the <strong>product</strong> of the remaining elements leaves a <em>remainder</em> of <code>x</code> <strong>modulo</strong> <code>k</code>.</p>

<p>For each query in <code>queries</code> you need to determine the <strong>x-value</strong> of <code>nums</code> for <code>x<sub>i</sub></code> after performing the following actions:</p>

<ul>
	<li>Update <code>nums[index<sub>i</sub>]</code> to <code>value<sub>i</sub></code>. Only this step persists for the rest of the queries.</li>
	<li><strong>Remove</strong> the prefix <code>nums[0..(start<sub>i</sub> - 1)]</code> (where <code>nums[0..(-1)]</code> will be used to represent the <strong>empty</strong> prefix).</li>
</ul>

<p>Return an array <code>result</code> of size <code>queries.length</code> where <code>result[i]</code> is the answer for the <code>i<sup>th</sup></code> query.</p>

<p>A <strong>prefix</strong> of an array is a <span data-keyword="subarray">subarray</span> that starts from the beginning of the array and extends to any point within it.</p>

<p>A <strong>suffix</strong> of an array is a <span data-keyword="subarray">subarray</span> that starts at any point within the array and extends to the end of the array.</p>

<p><strong>Note</strong> that the prefix and suffix to be chosen for the operation can be <strong>empty</strong>.</p>

<p><strong>Note</strong> that x-value has a <em>different</em> definition in this version.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [1,2,3,4,5], k = 3, queries = [[2,2,0,2],[3,3,3,0],[0,1,0,1]]</span></p>

<p><strong>Output:</strong> <span class="example-io">[2,2,2]</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>For query 0, <code>nums</code> becomes <code>[1, 2, 2, 4, 5]</code>, and the empty prefix <strong>must</strong> be removed. The possible operations are:

	<ul>
		<li>Remove the suffix <code>[2, 4, 5]</code>. <code>nums</code> becomes <code>[1, 2]</code>.</li>
		<li>Remove the empty suffix. <code>nums</code> becomes <code>[1, 2, 2, 4, 5]</code> with a product 80, which gives remainder 2 when divided by 3.</li>
	</ul>
	</li>
	<li>For query 1, <code>nums</code> becomes <code>[1, 2, 2, 3, 5]</code>, and the prefix <code>[1, 2, 2]</code> <strong>must</strong> be removed. The possible operations are:
	<ul>
		<li>Remove the empty suffix. <code>nums</code> becomes <code>[3, 5]</code>.</li>
		<li>Remove the suffix <code>[5]</code>. <code>nums</code> becomes <code>[3]</code>.</li>
	</ul>
	</li>
	<li>For query 2, <code>nums</code> becomes <code>[1, 2, 2, 3, 5]</code>, and the empty prefix <strong>must</strong> be removed. The possible operations are:
	<ul>
		<li>Remove the suffix <code>[2, 2, 3, 5]</code>. <code>nums</code> becomes <code>[1]</code>.</li>
		<li>Remove the suffix <code>[3, 5]</code>. <code>nums</code> becomes <code>[1, 2, 2]</code>.</li>
	</ul>
	</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [1,2,4,8,16,32], k = 4, queries = [[0,2,0,2],[0,2,0,1]]</span></p>

<p><strong>Output:</strong> <span class="example-io">[1,0]</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>For query 0, <code>nums</code> becomes <code>[2, 2, 4, 8, 16, 32]</code>. The only possible operation is:

	<ul>
		<li>Remove the suffix <code>[2, 4, 8, 16, 32]</code>.</li>
	</ul>
	</li>
	<li>For query 1, <code>nums</code> becomes <code>[2, 2, 4, 8, 16, 32]</code>. There is no possible way to perform the operation.</li>
</ul>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [1,1,2,1,1], k = 2, queries = [[2,1,0,1]]</span></p>

<p><strong>Output:</strong> <span class="example-io">[5]</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>1 &lt;= k &lt;= 5</code></li>
	<li><code>1 &lt;= queries.length &lt;= 2 * 10<sup>4</sup></code></li>
	<li><code>queries[i] == [index<sub>i</sub>, value<sub>i</sub>, start<sub>i</sub>, x<sub>i</sub>]</code></li>
	<li><code>0 &lt;= index<sub>i</sub> &lt;= nums.length - 1</code></li>
	<li><code>1 &lt;= value<sub>i</sub> &lt;= 10<sup>9</sup></code></li>
	<li><code>0 &lt;= start<sub>i</sub> &lt;= nums.length - 1</code></li>
	<li><code>0 &lt;= x<sub>i</sub> &lt;= k - 1</code></li>
</ul>

## Constraints



## Solution

```java
// LeetCode Problem: Find X Value of Array II
// Link: https://leetcode.com/problems/find-x-value-of-array-ii/
// Difficulty: Hard
// Language: java

class Solution {
    private static class Info {
        int[] ways;
        int whole;

        Info(int k) {
            ways = new int[k];
            whole = 1;
        }
    }

    private static class SegmentTree {
        int size;
        int mod;
        Info[] tree;

        SegmentTree(int[] nums, int k) {
            mod = k;
            size = 1;

            while (size < nums.length) {
                size <<= 1;
            }

            tree = new Info[size * 2];

            for (int i = 0; i < tree.length; i++) {
                tree[i] = new Info(k);
            }

            for (int i = 0; i < nums.length; i++) {
                int rem = nums[i] % k;

                tree[size + i].ways[rem] = 1;
                tree[size + i].whole = rem;
            }

            for (int i = size - 1; i > 0; i--) {
                tree[i] = combine(tree[i << 1], tree[i << 1 | 1]);
            }
        }

        private Info combine(Info left, Info right) {
            Info merged = new Info(mod);

            for (int r = 0; r < mod; r++) {
                merged.ways[r] = left.ways[r];
            }

            for (int r = 0; r < mod; r++) {
                if (right.ways[r] == 0) {
                    continue;
                }

                int newRem = (left.whole * r) % mod;
                merged.ways[newRem] += right.ways[r];
            }

            merged.whole = (left.whole * right.whole) % mod;

            return merged;
        }

        void update(int index, int value) {
            int pos = size + index;
            int rem = value % mod;

            Arrays.fill(tree[pos].ways, 0);
            tree[pos].ways[rem] = 1;
            tree[pos].whole = rem;

            pos >>= 1;

            while (pos > 0) {
                tree[pos] = combine(
                    tree[pos << 1],
                    tree[pos << 1 | 1]
                );

                pos >>= 1;
            }
        }

        Info query(int left, int right) {
            Info leftPart = new Info(mod);
            Info rightPart = new Info(mod);

            left += size;
            right += size;

            while (left < right) {
                if ((left & 1) != 0) {
                    leftPart = combine(leftPart, tree[left]);
                    left++;
                }

                if ((right & 1) != 0) {
                    right--;
                    rightPart = combine(tree[right], rightPart);
                }

                left >>= 1;
                right >>= 1;
            }

            return combine(leftPart, rightPart);
        }
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        SegmentTree tree = new SegmentTree(nums, k);
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];
            int value = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];

            tree.update(index, value);

            Info result = tree.query(start, nums.length);
            answer[i] = result.ways[x];
        }

        return answer;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
