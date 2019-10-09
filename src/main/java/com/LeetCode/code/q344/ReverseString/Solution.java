package com.LeetCode.code.q344.ReverseString;
/**
 * @QuestionId	:	344
 * @difficulty	:	Easy
 * @Title	 	:	Reverse String
 * @TranslatedTitle:反转字符串
 * @url			:	https://leetcode-cn.com/problems/reverse-string/
 * @TranslatedContent:编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
	
	不要给另外的数组分配额外的空间，你必须<a href="https://baike.baidu.com/item/原地算法" target="_blank">原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
	
	你可以假设数组中的所有字符都是 <a href="https://baike.baidu.com/item/ASCII" target="_blank">ASCII 码表中的可打印字符。
	
	 
	
	示例 1：
	
	输入：["h","e","l","l","o"]
	输出：["o","l","l","e","h"]
	
	
	示例 2：
	
	输入：["H","a","n","n","a","h"]
	输出：["h","a","n","n","a","H"]
	
 */
class Solution {
    public void reverseString(char[] s) {
    	int i = 0;
    	int j = s.length-1;
    	while(i<j) {
    		char a = s[i];
    		s[i] = s[j];
    		s[j] = a;
    		i++;
    		j--;
    	}
    	System.out.println(String.valueOf(s));
    }
    
    public static void main(String[] args) {
		char[] a1 = new char[] {'H','a','n','n','a','h'};
		new Solution().reverseString(a1);
		
	}
}