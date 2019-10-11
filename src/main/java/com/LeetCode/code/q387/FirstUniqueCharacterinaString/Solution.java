package com.LeetCode.code.q387.FirstUniqueCharacterinaString;

import java.util.HashMap;

/**
 * @QuestionId	:	387
 * @difficulty	:	Easy
 * @Title	 	:	First Unique Character in a String
 * @TranslatedTitle:字符串中的第一个唯一字符
 * @url			:	https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 * @TranslatedContent:给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
	
	案例:
	
	
	s = "leetcode"
	返回 0.
	
	s = "loveleetcode",
	返回 2.
	
	
	 
	
	注意事项：您可以假定该字符串只包含小写字母。
	
 */
class Solution {
	
	/**
	 * 超时 
	 * 优化完可以过
	 * @param s
	 * @return
	 */
    public int firstUniqChar(String s) {
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		//优化
    		if('z'-c>26) {
    			continue;
    		}
    		s = s.replaceFirst(String.valueOf(c), String.valueOf(c).toUpperCase());
			if(!s.contains(String.valueOf(c))) {
				return i;
			}else {
				s=s.replace(String.valueOf(c), String.valueOf(c).toUpperCase());
			}
		}
        return -1;
    }
    
    
    public int firstUniqChar2(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
    	String s = "leetcode"; 
		System.out.println(new Solution().firstUniqChar(s));
		//System.out.println(s);
	}
}