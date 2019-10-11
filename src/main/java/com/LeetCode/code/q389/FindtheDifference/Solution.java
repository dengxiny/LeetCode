package com.LeetCode.code.q389.FindtheDifference;
/**
 * @QuestionId	:	389
 * @difficulty	:	Easy
 * @Title	 	:	Find the Difference
 * @TranslatedTitle:找不同
 * @url			:	https://leetcode-cn.com/problems/find-the-difference/
 * @TranslatedContent:给定两个字符串 s 和 t，它们只包含小写字母。
	
	字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
	
	请找出在 t 中被添加的字母。
	
	 
	
	示例:
	
	输入：
	s = "abcd"
	t = "abcde"
	
	输出：
	e
	
	解释：
	&#39;e&#39; 是那个被添加的字母。
	
	
 */
class Solution {
    public char findTheDifference(String s, String t) {
    	int[] r = new int[26];
    	for (char i : s.toCharArray()) {
			r[i-'a']=r[i-'a']+1;
		}
    	for (char i : t.toCharArray()) {
    		r[i-'a']=r[i-'a']-1;
		}
    	int size = 0;
    	for (int i : r) {
    		if(i<0) {
    			return (char) (size+'a');
    		}
    		size++;
		}
    	return 'a';
    }
}