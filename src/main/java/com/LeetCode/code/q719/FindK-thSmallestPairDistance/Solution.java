package com.LeetCode.code.q719.FindK-thSmallestPairDistance;
/**
 * @QuestionId	:	719
 * @difficulty	:	Hard
 * @Title	 	:	Find K-th Smallest Pair Distance
 * @TranslatedTitle:找出第 k 小的距离对
 * @url			:	https://leetcode-cn.com/problems/find-k-th-smallest-pair-distance/
 * @TranslatedContent:给定一个整数数组，返回所有数对之间的第 k 个最小距离。一对 (A, B) 的距离被定义为 A 和 B 之间的绝对差值。
	
	示例 1:
	
	
	输入：
	nums = [1,3,1]
	k = 1
	输出：0 
	解释：
	所有数对如下：
	(1,3) -> 2
	(1,1) -> 0
	(3,1) -> 2
	因此第 1 个最小距离的数对是 (1,1)，它们之间的距离为 0。
	
	
	提示:
	
	
		2 <= len(nums) <= 10000.
		0 <= nums[i] < 1000000.
		1 <= k <= len(nums) * (len(nums) - 1) / 2.
	
	
 */
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        
    }
}