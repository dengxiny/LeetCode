package com.LeetCode.code.q58.LengthofLastWord;
/**
 * @QuestionId	:	58
 * @difficulty	:	Easy
 * @Title	 	:	Length of Last Word
 * @TranslatedTitle:最后一个单词的长度
 * @url			:	https://leetcode-cn.com/problems/length-of-last-word/
 * @TranslatedContent:给定一个仅包含大小写字母和空格 &#39; &#39; 的字符串，返回其最后一个单词的长度。
	
	如果不存在最后一个单词，请返回 0 。
	
	说明：一个单词是指由字母组成，但不包含任何空格的字符串。
	
	示例:
	
	输入: "Hello World"
	输出: 5
	
	
 */
class Solution {
    public int lengthOfLastWord(String s) {
    	s = s.trim();
        for (int i = s.length()-1; i >= 0 ; i--) {
			if(s.charAt(i)==' ') {
				return s.length()-1-i;
			}
		}
        return s.length();
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().lengthOfLastWord("a "));
	}
}