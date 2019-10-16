package com.LeetCode.code.q459.RepeatedSubstringPattern;
/**
 * @QuestionId	:	459
 * @difficulty	:	Easy
 * @Title	 	:	Repeated Substring Pattern
 * @TranslatedTitle:重复的子字符串
 * @url			:	https://leetcode-cn.com/problems/repeated-substring-pattern/
 * @TranslatedContent:给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
	
	示例 1:
	
	
	输入: "abab"
	
	输出: True
	
	解释: 可由子字符串 "ab" 重复两次构成。
	
	
	示例 2:
	
	
	输入: "aba"
	
	输出: False
	
	
	示例 3:
	
	
	输入: "abcabcabcabc"
	
	输出: True
	
	解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
	
	
 */
class Solution {
    public boolean repeatedSubstringPattern(String s) {
    	for (int i = 2; i <= s.length(); i++) {
			if(s.length()%i==0) {
				int size = s.length()/i;
				String s1 = s.substring(0,size);
				System.out.println(s1);
				boolean flag =true;
				for (int j = 0; j < i; j++) {
					String s2 = s.substring(j*(size), size*(j+1));
					if(!s1.equals(s2)) {
						flag= false;
					}
				}
				if(flag==true) {
					return true;
				}
			}
		}
        return false;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().repeatedSubstringPattern("aaa"));
	}
}