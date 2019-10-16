package com.LeetCode.code.q414.ThirdMaximumNumber;

import java.util.Arrays;

/**
 * @QuestionId	:	414
 * @difficulty	:	Easy
 * @Title	 	:	Third Maximum Number
 * @TranslatedTitle:第三大的数
 * @url			:	https://leetcode-cn.com/problems/third-maximum-number/
 * @TranslatedContent:给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
	
	示例 1:
	
	
	输入: [3, 2, 1]
	
	输出: 1
	
	解释: 第三大的数是 1.
	
	
	示例 2:
	
	
	输入: [1, 2]
	
	输出: 2
	
	解释: 第三大的数不存在, 所以返回最大的数 2 .
	
	
	示例 3:
	
	
	输入: [2, 2, 3, 1]
	
	输出: 1
	
	解释: 注意，要求返回第三大的数，是指第三大且唯一出现的数。
	存在两个值为2的数，它们都排第二。
	
	
 */
class Solution {
    public int thirdMax(int[] nums) {
    	Arrays.sort(nums);
    	int count = 0;
    	int sum = nums[nums.length-1];
    	for (int i = nums.length-1; i >=0 ;i--) {
			if(sum>nums[i]) {
				sum=nums[i];
				count++;
			}
			if(count==2) {
				break;
			}
		}
    	if(count==2) {
    		return sum;
    	}
        return nums[nums.length-1];
    }
    
    public static void main(String[] args) {
    	System.out.println(new Solution().thirdMax(new int[] {3,2,1}));
		
	}
}