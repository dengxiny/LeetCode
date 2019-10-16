package com.LeetCode.code.q485.MaxConsecutiveOnes;
/**
 * @QuestionId	:	485
 * @difficulty	:	Easy
 * @Title	 	:	Max Consecutive Ones
 * @TranslatedTitle:最大连续1的个数
 * @url			:	https://leetcode-cn.com/problems/max-consecutive-ones/
 * @TranslatedContent:给定一个二进制数组， 计算其中最大连续1的个数。
	
	示例 1:
	
	
	输入: [1,1,0,1,1,1]
	输出: 3
	解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
	
	
	注意：
	
	
		输入的数组只包含 0 和1。
		输入数组的长度是正整数，且不超过 10,000。
	
	
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    	int count1=0,count2=0,i=0,j=nums.length-1,sum=0;
    	while(i<=j) {
    		if(nums[i]>0) {
    			count1++;
    		}else {
    			sum=sum>count1?sum:count1;
    			count1=0;
    		}
    		
    		if(nums[j]>0) {
    			count2++;
    		}else {
    			sum=sum>count2?sum:count2;
    			count2=0;
    		}
    		if(i==j) {
    			return sum>count1+count2-1?sum:count1+count2-1;
    		}
    		i++;
    		j--;
    		
    	}
    	return sum>count1+count2?sum:count1+count2;
    }
    
    public static void main(String[] args) {
    	System.out.println(new Solution().findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1}));
		System.out.println(new Solution().findMaxConsecutiveOnes(new int[] {1,0,1,1,1,0,1}));
		System.out.println(new Solution().findMaxConsecutiveOnes(new int[] {1,1,0,1,1}));
		System.out.println(new Solution().findMaxConsecutiveOnes(new int[] {0,0,1,0,0}));
		System.out.println(new Solution().findMaxConsecutiveOnes(new int[] {0,0,1,1,0}));
	}
}