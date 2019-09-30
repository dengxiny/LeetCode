package com.LeetCode.code.q1010.PowerfulIntegers;

import java.util.ArrayList;
import java.util.List;

/**
 * @QuestionId	:	1010
 * @difficulty	:	Easy
 * @Title	 	:	Powerful Integers
 * @TranslatedTitle:强整数
 * @url			:	https://leetcode-cn.com/problems/powerful-integers/
 * @TranslatedContent:给定两个正整数 x 和 y，如果某一整数等于 x^i + y^j，其中整数 i >= 0 且 j >= 0，那么我们认为该整数是一个强整数。
	
	返回值小于或等于 bound 的所有强整数组成的列表。
	
	你可以按任何顺序返回答案。在你的回答中，每个值最多出现一次。
	
	 
	
	示例 1：
	
	输入：x = 2, y = 3, bound = 10
	输出：[2,3,4,5,7,9,10]
	解释： 
	2 = 2^0 + 3^0
	3 = 2^1 + 3^0
	4 = 2^0 + 3^1
	5 = 2^1 + 3^1
	7 = 2^2 + 3^1
	9 = 2^3 + 3^0
	10 = 2^0 + 3^2
	
	
	示例 2：
	
	输入：x = 3, y = 5, bound = 15
	输出：[2,4,6,8,10,14]
	
	
	 
	
	提示：
	
	
		1 <= x <= 100
		1 <= y <= 100
		0 <= bound <= 10^6
	
	
 */
class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
    	List<Integer> list = new ArrayList<Integer>();
    	int countX = 1; 
    	int countY = 1; 
        for (int i = 0; i < 101; i++) {
        	if(i>0){
        		countX = countX * x;
        	}
        	if(countX>1000000) {
        		break;
        	}
			for (int j = 0; j < 101; j++) {
				if(countY>1000000) {
					countY=1;
					break ;
				}else {
					if(j>0) {
						countY = countY * y;
					}
					int sum = countX +countY;
					//System.out.println(i+" "+countX+" "+j+" "+countY+" "+sum);
					if(sum<=bound&&!list.contains(sum)) {
						list.add(sum);
					}
				}
			}
		}
        return list;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().powerfulIntegers(2, 3, 10));
	}
}