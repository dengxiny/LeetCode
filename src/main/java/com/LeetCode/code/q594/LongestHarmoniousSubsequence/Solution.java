package com.LeetCode.code.q594.LongestHarmoniousSubsequence;

import java.util.HashMap;
import java.util.Set;

/**
 * @QuestionId	:	594
 * @difficulty	:	Easy
 * @Title	 	:	Longest Harmonious Subsequence
 * @TranslatedTitle:最长和谐子序列
 * @url			:	https://leetcode-cn.com/problems/longest-harmonious-subsequence/
 * @TranslatedContent:和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。
	
	现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。
	
	示例 1:
	
	
	输入: [1,3,2,2,5,2,3,7]
	输出: 5
	原因: 最长的和谐数组是：[3,2,2,2,3].
	
	
	说明: 输入的数组长度最大不超过20,000.
	
 */
class Solution {
	/**
	 * 
	 * @param nums
	 * @return
	 */
    public int findLHS(int[] nums) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for (int i : nums) {
			map.put(i,map.get(i)==null?1:map.get(i)+1);
		}
    	int count = 0 ;
        for (Integer key: map.keySet()) {
			if(map.get(key-1)!=null) {
				count = Math.max(count, map.get(key)+map.get(key-1));
			}
		}
        return count;
    }
	/**
	 * 暴力
	 * @param nums
	 * @return
	 */
    public int findLHS2(int[] nums) {
    	int max = 0;
    	for (int i : nums) {
    		int count = 0;
    		int count1 =0;
	    	for (int j : nums) {
				if(i-j==0) {
					count++;
				}
				if(i-j==-1) {
					count1++;
				}
			}
	    	if(count1==0) {
	    		count = 0;
	    	}
	    	max = Math.max(count+count1, max);
    	}
    	return max;
        
    }
}