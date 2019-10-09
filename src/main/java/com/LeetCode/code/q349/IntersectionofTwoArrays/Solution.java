package com.LeetCode.code.q349.IntersectionofTwoArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @QuestionId	:	349
 * @difficulty	:	Easy
 * @Title	 	:	Intersection of Two Arrays
 * @TranslatedTitle:两个数组的交集
 * @url			:	https://leetcode-cn.com/problems/intersection-of-two-arrays/
 * @TranslatedContent:给定两个数组，编写一个函数来计算它们的交集。
	
	示例 1:
	
	输入: nums1 = [1,2,2,1], nums2 = [2,2]
	输出: [2]
	
	
	示例 2:
	
	输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
	输出: [9,4]
	
	说明:
	
	
		输出结果中的每个元素一定是唯一的。
		我们可以不考虑输出结果的顺序。
	
	
 */
class Solution {
	
	
	
	
    public int[] intersection(int[] nums1, int[] nums2) {
    	int a = nums1.length,b = nums2.length;
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
    	if(a>b) {
    		for (int i : nums1) {
    			map.put(i, i);
			}
    		for (int i : nums2) {
				if(map.containsKey(i)) {
					map2.put(i, i);
				}
			}
    	}else {
    		for (int i : nums2) {
    			map.put(i, i);
			}
    		for (int i : nums1) {
				if(map.containsKey(i)) {
					map2.put(i, i);
				}
			}
    	}
    	int[] re = new int[map2.size()];
    	int i=0;
    	for (Integer key : map2.keySet()) {
    		re[i++]=key;
        }
    	return re;
        
    }
}