package com.LeetCode.code.q645.SetMismatch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @QuestionId	:	645
 * @difficulty	:	Easy
 * @Title	 	:	Set Mismatch
 * @TranslatedTitle:错误的集合
 * @url			:	https://leetcode-cn.com/problems/set-mismatch/
 * @TranslatedContent:集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。
	
	给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
	
	示例 1:
	
	
	输入: nums = [1,2,2,4]
	输出: [2,3]
	
	
	注意:
	
	
		给定数组的长度范围是 [2, 10000]。
		给定的数组是无序的。
	
	
 */
class Solution {
    public int[] findErrorNums(int[] nums) {
    	int[] res = new int[2] ;
    	Map<Integer, Integer> map = new HashMap<>();
    	for (int i = 0; i < nums.length; i++) {
    		map.put(nums[i], map.get(nums[i])==null?1:map.get(nums[i])+1);
		}
    	for (int i = 1; i <= nums.length; i++) {
			if(!map.containsKey(i)) {
				res[1]=i;
			}else if(2==map.get(i)){
				res[0]=i;
			}
		}
    	return res;
        
    }
    
    /**
     * 评论优化
     * @param nums
     * @return
     */
    public int[] findErrorNums2(int[] nums) {
        int sum = 0, dup = 0, len = nums.length;       
        for (int i = 0; i < len; ++i) {
            if (nums[Math.abs(nums[i]) - 1] > 0) nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
            else dup = Math.abs(nums[i]);
            sum += Math.abs(nums[i]);
        }
        return new int[]{dup, dup - (sum - (len * (len + 1)) / 2)};
    }


    
    public static void main(String[] args) {
    	// 1 2 2 4
    	// 1 2 2 3
    	// 1 2 2 3 4
    	// 1 2 2 3 4 5 6 7 8 9
    	//1,5,3,2,2,7,6,4,8,9
    	//[3,2,3,4,6,5]
    	// 2 3 3 4 5 6
    	int[] a = new Solution().findErrorNums(new int[] {3,2,3,4,6,5});
		System.out.println(a[0]+"-"+a[1]);
		
		
	}
    
}