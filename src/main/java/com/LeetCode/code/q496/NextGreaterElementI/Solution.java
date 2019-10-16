package com.LeetCode.code.q496.NextGreaterElementI;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * @QuestionId	:	496
 * @difficulty	:	Easy
 * @Title	 	:	Next Greater Element I
 * @TranslatedTitle:下一个更大元素 I
 * @url			:	https://leetcode-cn.com/problems/next-greater-element-i/
 * @TranslatedContent:给定两个没有重复元素的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。
	
	nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出-1。
	
	示例 1:
	
	
	输入: nums1 = [4,1,2], nums2 = [1,3,4,2].
	输出: [-1,3,-1]
	解释:
	    对于num1中的数字4，你无法在第二个数组中找到下一个更大的数字，因此输出 -1。
	    对于num1中的数字1，第二个数组中数字1右边的下一个较大数字是 3。
	    对于num1中的数字2，第二个数组中没有下一个更大的数字，因此输出 -1。
	
	示例 2:
	
	
	输入: nums1 = [2,4], nums2 = [1,2,3,4].
	输出: [3,-1]
	解释:
	    对于num1中的数字2，第二个数组中的下一个较大数字是3。
	    对于num1中的数字4，第二个数组中没有下一个更大的数字，因此输出 -1。
	
	
	注意:
	
	
		nums1和nums2中所有元素是唯一的。
		nums1和nums2 的数组大小都不超过1000。
	
	
 */
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] r = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
        	r[i]=-1;
			for (int j = 0; j < nums2.length; j++) {
				if(nums1[i]==nums2[j]) {
					for (int j2 = j+1; j2 < nums2.length; j2++) {
						if(nums2[j]<nums2[j2]) {
							r[i]=nums2[j2];
							break;
						}
					}
					break;
				}
			}
		}
        return r;
    }
    
    public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
    	int[] r = new int[nums1.length];
    	HashMap<Integer,Integer> map = new HashMap<>();
    	LinkedList<Integer> list = new LinkedList<>();
    	for (int i : nums2) {
			while(list.size()>0&&list.getFirst()<i) {
				map.put(list.removeFirst(),i);
			}
			list.addFirst(i);;
		}
    	for (int i = 0; i < nums1.length; i++) {
			r[i]=map.get(nums1[i])==null?-1:map.get(nums1[i]);
		}
    	return r;
    }
    
    public static void main(String[] args) {
	//	new Solution().nextGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2});
	//	new Solution().nextGreaterElement2(new int[] {2,4}, new int[] {1,2,3,4});
		new Solution().nextGreaterElement2(new int[] {2,4}, new int[] {2,1,3,4});
	}
}