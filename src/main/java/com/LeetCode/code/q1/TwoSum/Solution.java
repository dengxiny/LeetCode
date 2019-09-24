package com.LeetCode.code.q1.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @QuestionId	:	1
 * @difficulty	:	Easy
 * @Title	 	:	Two Sum
 * @TranslatedTitle:两数之和
 * @url			:	https://leetcode-cn.com/problems/two-sum/
 * @TranslatedContent:给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
	
	你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
	
	示例:
	
	给定 nums = [2, 7, 11, 15], target = 9
	
	因为 nums[0] + nums[1] = 2 + 7 = 9
	所以返回 [0, 1]
	
	
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target-nums[i])) {
				return new int[] {map.get(target-nums[i]),i};
			}else {
				map.put(nums[i], i);
			}
		}
        return nums;
    }
    
    public int[] twoSum2(int[] nums, int target) {
        int[] in=null;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(target-nums[j]-nums[i]==0) {
					in=new int[] {i,j};
				}
			}
		}
        return in;
    }
    
    /**
     * 暴力解法两个for循环 但是复杂度太高 O(n)
     * 把第二次循环转成字典方式 哈希查找的时间复杂度为 O(1)
     * (2,0) (7,1) (11,2) (15,3)
     * 返回 target - key + key 两个value
     */
    public static void main(String[] args) {
    	int[] nums = new int[] {2, 7, 11, 15};
    	int target = 18;
    	int[] res = new Solution().twoSum(nums, target);
    	for (int i = 0; i < res.length; i++) {
    		System.out.println(res[i]);
		}
	}
}