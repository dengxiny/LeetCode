package com.LeetCode.code.q1019.SquaresofaSortedArray;

import java.util.Arrays;

/**
 * @QuestionId	:	1019
 * @difficulty	:	Easy
 * @Title	 	:	Squares of a Sorted Array
 * @TranslatedTitle:有序数组的平方
 * @url			:	https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * @TranslatedContent:给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
	
	 
	
	示例 1：
	
	输入：[-4,-1,0,3,10]
	输出：[0,1,9,16,100]
	
	
	示例 2：
	
	输入：[-7,-3,2,3,11]
	输出：[4,9,9,49,121]
	
	
	 
	
	提示：
	
	
		1 <= A.length <= 10000
		-10000 <= A[i] <= 10000
		A 已按非递减顺序排序。
	
	
 */
class Solution {
    public int[] sortedSquares(int[] A) {
    	int [] arr = new int[A.length];
        for (int i = 0; i < arr.length; i++) {
			arr[i]=A[i]*A[i];
		}
        Arrays.sort(arr);
        return arr;
    }
    
    public int[] sortedSquares2(int[] A) {
    	int len = A.length;
    	int i = 0;
    	while(i<len&&A[i]<0) {
    		i++;
    	}
    	int size = i-1;
    	int [] arr = new int[A.length];
    	int count = 0;
    	while(size>0&&i<len) {
    		if(A[size]*A[size]>A[i]*A[i]) {
    			arr[count++] =A[i]*A[i];
    			size--;
    		}else {
    			arr[count++]=A[size]*A[size];
    			i++;
    		}
    	}
        return arr;
    }
    
    
    public static void main(String[] args) {
    	int[] arr = new Solution().sortedSquares(new int[] {-4,-1,0,3,10});
		for (int i : arr) {
			System.out.print(i+",");
		}
	}
}