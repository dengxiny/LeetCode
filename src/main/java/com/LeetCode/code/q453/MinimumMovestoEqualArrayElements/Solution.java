package com.LeetCode.code.q453.MinimumMovestoEqualArrayElements;

import java.util.Arrays;

/**
 * @QuestionId	:	453
 * @difficulty	:	Easy
 * @Title	 	:	Minimum Moves to Equal Array Elements
 * @TranslatedTitle:最小移动次数使数组元素相等
 * @url			:	https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
 * @TranslatedContent:给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动可以使 n - 1 个元素增加 1。
	
	示例:
	
	
	输入:
	[1,2,3]
	
	输出:
	3
	
	解释:
	只需要3次移动（注意每次移动会增加两个元素的值）：
	
	[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
	
	
 */
class Solution {
	/**
	 * 反过来看每次最大值-1;
	 * @param nums
	 * @return
	 */
    public int minMoves(int[] nums) {
    	int sum = 0;
    	int count = Integer.MAX_VALUE;
    	for (int i = 0; i < nums.length; i++) {
			if(nums[i]>count) {
				sum+=(nums[i]-count);
			}else {
				sum+=i*(count-nums[i]);
				count=nums[i];
			}
		}
        return sum;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().minMoves(new int[] {83,86,77,15,93,35,86,92,49,21}));
	}
}