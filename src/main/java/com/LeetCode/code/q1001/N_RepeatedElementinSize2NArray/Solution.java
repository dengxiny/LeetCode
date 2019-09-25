package com.LeetCode.code.q1001.N_RepeatedElementinSize2NArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @QuestionId	:	1001
 * @difficulty	:	Easy
 * @Title	 	:	N-Repeated Element in Size 2N Array
 * @TranslatedTitle:重复 N 次的元素
 * @url			:	https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array/
 * @TranslatedContent:在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
	
	返回重复了 N 次的那个元素。
	
	 
	
	
	
	
	示例 1：
	
	输入：[1,2,3,3]
	输出：3
	
	
	示例 2：
	
	输入：[2,1,2,5,3,2]
	输出：2
	
	
	示例 3：
	
	输入：[5,1,5,2,5,3,5,4]
	输出：5
	
	
	 
	
	提示：
	
	
		4 <= A.length <= 10000
		0 <= A[i] < 10000
		A.length 为偶数
	
	
 */
class Solution {
    public int repeatedNTimes(int[] A) {
       int len = A.length;
       Map<Integer,Integer> map = new HashMap<>();
       for (int i = 0; i < len; i++) {
    	   if(map.containsKey(A[i])) {
    		   return A[i];
    	   }
    	   map.put(A[i], A[i]);
       }
       return 0;
    }
    
    public static void main(String[] args) {
    	int[] A = new int[] {8,3,2,3};
    	System.out.println(new Solution().repeatedNTimes(A));
	}
}