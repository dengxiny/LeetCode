package com.LeetCode.code.q1024.TripleswithBitwiseANDEqualToZero;
/**
 * @QuestionId	:	1024
 * @difficulty	:	Hard
 * @Title	 	:	Triples with Bitwise AND Equal To Zero
 * @TranslatedTitle:按位与为零的三元组
 * @url			:	https://leetcode-cn.com/problems/triples-with-bitwise-and-equal-to-zero/
 * @TranslatedContent:给定一个整数数组 A，找出索引为 (i, j, k) 的三元组，使得：
	
	
		0 <= i < A.length
		0 <= j < A.length
		0 <= k < A.length
		A[i] &amp; A[j] &amp; A[k] == 0，其中 &amp; 表示按位与（AND）操作符。
	
	
	 
	
	示例：
	
	输入：[2,1,3]
	输出：12
	解释：我们可以选出如下 i, j, k 三元组：
	(i=0, j=0, k=1) : 2 &amp; 2 &amp; 1
	(i=0, j=1, k=0) : 2 &amp; 1 &amp; 2
	(i=0, j=1, k=1) : 2 &amp; 1 &amp; 1
	(i=0, j=1, k=2) : 2 &amp; 1 &amp; 3
	(i=0, j=2, k=1) : 2 &amp; 3 &amp; 1
	(i=1, j=0, k=0) : 1 &amp; 2 &amp; 2
	(i=1, j=0, k=1) : 1 &amp; 2 &amp; 1
	(i=1, j=0, k=2) : 1 &amp; 2 &amp; 3
	(i=1, j=1, k=0) : 1 &amp; 1 &amp; 2
	(i=1, j=2, k=0) : 1 &amp; 3 &amp; 2
	(i=2, j=0, k=1) : 3 &amp; 2 &amp; 1
	(i=2, j=1, k=0) : 3 &amp; 1 &amp; 2
	
	
	 
	
	提示：
	
	
		1 <= A.length <= 1000
		0 <= A[i] < 2^16
	
	
 */
class Solution {
    public int countTriplets(int[] A) {
        
    }
}