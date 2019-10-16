package com.LeetCode.code.q448.FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @QuestionId	:	448
 * @difficulty	:	Easy
 * @Title	 	:	Find All Numbers Disappeared in an Array
 * @TranslatedTitle:找到所有数组中消失的数字
 * @url			:	https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 * @TranslatedContent:给定一个范围在  1 &le; a[i] &le; n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
	
	找到所有在 [1, n] 范围之间没有出现在数组中的数字。
	
	您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
	
	示例:
	
	
	输入:
	[4,3,2,7,8,2,3,1]
	
	输出:
	[5,6]
	
	
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
    	ArrayList<Integer> list = new ArrayList<Integer>();//store array elements
		int index;//set index where the elements should be stored 
		for (int i = 0; i < nums.length; i++) {
			index = (nums[i] - 1) % nums.length;
			nums[index] += nums.length;
		}
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] < nums.length)
				list.add(j + 1);//index+1 for what we get is index,ans is num
		}
		return list;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1}));
	}
}