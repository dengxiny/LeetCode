package com.LeetCode.code.q633.SumofSquareNumbers;
/**
 * @QuestionId	:	633
 * @difficulty	:	Easy
 * @Title	 	:	Sum of Square Numbers
 * @TranslatedTitle:平方数之和
 * @url			:	https://leetcode-cn.com/problems/sum-of-square-numbers/
 * @TranslatedContent:给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
	
	示例1:
	
	
	输入: 5
	输出: True
	解释: 1 * 1 + 2 * 2 = 5
	
	
	 
	
	示例2:
	
	
	输入: 3
	输出: False
	
	
 */
class Solution {
    public boolean judgeSquareSum(int c) {
    	int a = (int)Math.pow(c, 0.5);
    	int i=0;
    	while(i<=a) {
    		int sum = i*i+a*a;
    		if(sum==c) {
				return true;
			}else if (sum>c) {
				a--;
			}else if (sum<c) {
				i++;
			}
    	}
		return false;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().judgeSquareSum(2147483643));
	}
}