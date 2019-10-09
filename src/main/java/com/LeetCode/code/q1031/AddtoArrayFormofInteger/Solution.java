package com.LeetCode.code.q1031.AddtoArrayFormofInteger;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @QuestionId	:	1031
 * @difficulty	:	Easy
 * @Title	 	:	Add to Array-Form of Integer
 * @TranslatedTitle:数组形式的整数加法
 * @url			:	https://leetcode-cn.com/problems/add-to-array-form-of-integer/
 * @TranslatedContent:对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
	
	给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
	
	 
	
	
	
	
	示例 1：
	
	输入：A = [1,2,0,0], K = 34
	输出：[1,2,3,4]
	解释：1200 + 34 = 1234
	
	
	解释 2：
	
	输入：A = [2,7,4], K = 181
	输出：[4,5,5]
	解释：274 + 181 = 455
	
	
	示例 3：
	
	输入：A = [2,1,5], K = 806
	输出：[1,0,2,1]
	解释：215 + 806 = 1021
	
	
	示例 4：
	
	输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
	输出：[1,0,0,0,0,0,0,0,0,0,0]
	解释：9999999999 + 1 = 10000000000
	
	
	 
	
	提示：
	
	
		1 <= A.length <= 10000
		0 <= A[i] <= 9
		0 <= K <= 10000
		如果 A.length > 1，那么 A[0] != 0
	
	
 */
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
    	int N = A.length;
    	int cur = K;
    	List<Integer> list = new ArrayList<Integer>();
    	while(N>0||cur>0) {
    		if(N>0) {
    			N--;
    			cur+=A[N];
    			list.add(cur%10);
    		}else {
    			list.add(cur%10);
    		}
    		cur=cur/10;
    	}
    	Collections.reverse(list);
    	return list;
    }
    
    public static void main(String[] args) {
    	System.out.println(new Solution().addToArrayForm(new int[] {2,1,5}, 806));
	}
}