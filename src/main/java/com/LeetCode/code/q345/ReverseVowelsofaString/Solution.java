package com.LeetCode.code.q345.ReverseVowelsofaString;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @QuestionId	:	345
 * @difficulty	:	Easy
 * @Title	 	:	Reverse Vowels of a String
 * @TranslatedTitle:反转字符串中的元音字母
 * @url			:	https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
 * @TranslatedContent:编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
	
	示例 1:
	
	输入: "hello"
	输出: "holle"
	
	
	示例 2:
	
	输入: "leetcode"
	输出: "leotcede"
	
	说明:
	元音字母不包含字母"y"。
	
 */
class Solution {
	
	private final static HashSet<Character> set = new HashSet<>(Arrays.asList('a','o','e','i','u','A','O','E','I','U'));
    public String reverseVowels(String s) {
    	char[] result = new char[s.toCharArray().length];
    	int i = 0,j = result.length-1;
    	while(i<=j) {
    		char a = s.charAt(i);
    		char b = s.charAt(j);
    		if(!set.contains(a)) {
    			result[i++]=a;
    		}else if(!set.contains(b)) {
    			result[j--]=b;
    		}else {
    			result[i++]=b;
    			result[j--]=a;
    		}
    	}
        return new String(result);
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().reverseVowels("leetcode"));
	}
}