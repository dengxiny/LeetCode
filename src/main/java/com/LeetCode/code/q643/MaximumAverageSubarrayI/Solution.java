package com.LeetCode.code.q643.MaximumAverageSubarrayI;

import java.util.LinkedList;

/**
 * @QuestionId	:	643
 * @difficulty	:	Easy
 * @Title	 	:	Maximum Average Subarray I
 * @TranslatedTitle:子数组最大平均数 I
 * @url			:	https://leetcode-cn.com/problems/maximum-average-subarray-i/
 * @TranslatedContent:给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
	
	示例 1:
	
	输入: [1,12,-5,-6,50,3], k = 4
	输出: 12.75
	解释: 最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
	
	
	 
	
	注意:
	
	
		1 <= k <= n <= 30,000。
		所给数据范围 [-10,000，10,000]。
	
	
 */
class Solution {
    public double findMaxAverage(int[] nums, int k) {
    	LinkedList<Integer> list = new LinkedList<>();
    	double sum = 0;
    	double max = Integer.MIN_VALUE;
    	for (int i = 0; i < nums.length; i++) {
    		int a ;
			a = nums[i];
			list.add(a);
			sum+=a;
			if(list.size()==k) {
				 max = Math.max(max, sum/k);
				 a = list.poll();
				 sum-=a;
			}
		}
		return max;
        
    }
    
    public double findMaxAverage2(int[] nums, int k) {
    	double sum = 0;
    	double max = 0;
    	for (int i = 0; i < k; i++) {
    		sum+=nums[i];
		}
    	max = sum;
    	for (int i = k; i < nums.length; i++) {
    		if(max<sum+nums[i]-nums[i-k]) {
    			max=sum+nums[i]-nums[i-k];
    		}
    		sum=sum+nums[i]-nums[i-k];
		}
		return max/k;
    }
    
    
    public static void main(String[] args) {
    	System.out.println(new Solution().findMaxAverage2(new int[] {5}, 1));
		System.out.println(new Solution().findMaxAverage2(new int[] {1,12,-5,-6,50,3}, 4));
		System.out.println(new Solution().findMaxAverage2(new int[] {0,4,0,3,2}, 1));
	}
}