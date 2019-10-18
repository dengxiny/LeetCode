package com.LeetCode.code.q504.Base7;
/**
 * @QuestionId	:	504
 * @difficulty	:	Easy
 * @Title	 	:	Base 7
 * @TranslatedTitle:七进制数
 * @url			:	https://leetcode-cn.com/problems/base-7/
 * @TranslatedContent:给定一个整数，将其转化为7进制，并以字符串形式输出。
	
	示例 1:
	
	
	输入: 100
	输出: "202"
	
	
	示例 2:
	
	
	输入: -7
	输出: "-10"
	
	
	注意: 输入范围是 [-1e7, 1e7] 。
	
 */
class Solution {
    public String convertToBase7(int num) {
    	int tem = num ;
        if(num==0) {
        	return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        num = Math.abs(num);
        while(num!=0) {
        	stringBuilder.append(num%7);
        	num=num/7;
        }
        if(tem<0) {
        	stringBuilder.append("-");
        }
        return stringBuilder.reverse().toString();
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().convertToBase7(-10));
	}
}