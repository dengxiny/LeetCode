package com.LeetCode.code.q557.ReverseWordsinaStringIII;
/**
 * @QuestionId	:	557
 * @difficulty	:	Easy
 * @Title	 	:	Reverse Words in a String III
 * @TranslatedTitle:反转字符串中的单词 III
 * @url			:	https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * @TranslatedContent:给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
	
	示例 1:
	
	
	输入: "Let&#39;s take LeetCode contest"
	输出: "s&#39;teL ekat edoCteeL tsetnoc" 
	
	
	注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
	
 */
class Solution {
    public String reverseWords(String s) {
    	StringBuilder b = new StringBuilder();
    	String[] s1  = s.split(" ");
    	for (String string : s1) {
    		StringBuilder sb = new StringBuilder();
			b.append(sb.append(string).reverse()).append(" ");
		}
    	return b.substring(0,s.length());
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().reverseWords("Let's take LeetCode contest"));
	}
}