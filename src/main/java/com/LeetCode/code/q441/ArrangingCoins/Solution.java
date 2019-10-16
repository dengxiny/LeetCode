package com.LeetCode.code.q441.ArrangingCoins;
/**
 * @QuestionId	:	441
 * @difficulty	:	Easy
 * @Title	 	:	Arranging Coins
 * @TranslatedTitle:排列硬币
 * @url			:	https://leetcode-cn.com/problems/arranging-coins/
 * @TranslatedContent:你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
	
	给定一个数字 n，找出可形成完整阶梯行的总行数。
	
	n 是一个非负整数，并且在32位有符号整型的范围内。
	
	示例 1:
	
	
	n = 5
	
	硬币可排列成以下几行:
	&curren;
	&curren; &curren;
	&curren; &curren;
	
	因为第三行不完整，所以返回2.
	
	
	示例 2:
	
	
	n = 8
	
	硬币可排列成以下几行:
	&curren;
	&curren; &curren;
	&curren; &curren; &curren;
	&curren; &curren;
	
	因为第四行不完整，所以返回3.
	
	
 */
class Solution {
    public int arrangeCoins(int n) {
        return (int)((Math.sqrt(1+8*(long)n)-1)/2);
    }
    public int arrangeCoins2(int n){
		return (int)((-1+Math.sqrt(1+8*(long)n))/2);
	}


    public static void main(String[] args) {
    	System.out.println(1804289383*8);
    	System.out.println(Integer.MAX_VALUE);
    	int n = 1804289383;
    	System.out.println(Math.sqrt(1+8*n));
    	System.out.println(Math.sqrt(1+8*(long)n));
		System.out.println(new Solution().arrangeCoins(1804289383));
		System.out.println(new Solution().arrangeCoins2(1804289383));
	}
}