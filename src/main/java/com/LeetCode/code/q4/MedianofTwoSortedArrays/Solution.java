package com.LeetCode.code.q4.MedianofTwoSortedArrays;
/**
 * @QuestionId	:	4
 * @difficulty	:	Hard
 * @Title	 	:	Median of Two Sorted Arrays
 * @TranslatedTitle:寻找两个有序数组的中位数
 * @url			:	https://leetcode-cn.com/problems/median-of-two-sorted-arrays/
 * @TranslatedContent:给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
	
	请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
	
	你可以假设 nums1 和 nums2 不会同时为空。
	
	示例 1:
	
	nums1 = [1, 3]
	nums2 = [2]
	
	则中位数是 2.0
	
	
	示例 2:
	
	nums1 = [1, 2]
	nums2 = [3, 4]
	
	则中位数是 (2 + 3)/2 = 2.5
	
	
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	double b = 0.00;
        int l1 = nums1.length;
        int l2 = nums2.length;
        if(nums1[l1-1]<=nums2[0]||nums2[l2-1]<=nums1[0]) {
        	if((l1+l2)%2==0) {

        	}else {
				
			}
        }
    }
}