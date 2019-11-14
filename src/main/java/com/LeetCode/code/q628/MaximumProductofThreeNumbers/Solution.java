package com.LeetCode.code.q628.MaximumProductofThreeNumbers;

import java.util.Arrays;

/**
 * @QuestionId	:	628
 * @difficulty	:	Easy
 * @Title	 	:	Maximum Product of Three Numbers
 * @TranslatedTitle:三个数的最大乘积
 * @url			:	https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
 * @TranslatedContent:给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
	
	示例 1:
	
	
	输入: [1,2,3]
	输出: 6
	
	
	示例 2:
	
	
	输入: [1,2,3,4]
	输出: 24
	
	
	注意:
	
	
		给定的整型数组长度范围是[3,104]，数组中所有的元素范围是[-1000, 1000]。
		输入的数组中任意三个数的乘积不会超出32位有符号整数的范围。
	
	
 */
class Solution {
    public int maximumProduct(int[] nums) {
        	Arrays.sort(nums);
        	int sum1 = Math.max(nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1], nums[nums.length-1]*nums[nums.length-2]*nums[0]);
        	int sum2 = Math.max(nums[0]*nums[1]*nums[2], nums[0]*nums[1]*nums[nums.length-1]);
        	return Math.max(sum1,sum2);
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().maximumProduct(new int[] {-4,-3,-1,3,4}));
	}
}