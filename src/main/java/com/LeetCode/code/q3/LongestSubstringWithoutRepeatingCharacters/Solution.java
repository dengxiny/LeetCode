package com.LeetCode.code.q3.LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @QuestionId	:	3
 * @difficulty	:	Medium
 * @Title	 	:	Longest Substring Without Repeating Characters
 * @TranslatedTitle:无重复字符的最长子串
 * @url			:	https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @TranslatedContent:给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
	
	示例 1:
	
	输入: "abcabcbb"
	输出: 3 
	解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
	
	
	示例 2:
	
	输入: "bbbbb"
	输出: 1
	解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
	
	
	示例 3:
	
	输入: "pwwkew"
	输出: 3
	解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
	     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
	
	
 */
class Solution {
	
	/**
	 * list方案 但是不满意
	 * @param s
	 * @return
	 */
    public int lengthOfLongestSubstring(String s) {
    	int count = 0;
    	List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
        	char c1 = s.charAt(i);
			if(list.contains(c1)) {
				int len = list.indexOf(c1);
				for (int j = 0; j <=len ; j++) {
					list.remove(0);
				}
			}
			list.add(c1);
			count = list.size()>count?list.size():count;
		}
        return count;
    }
    
    /**
     * 官方给的
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

    
    public static void main(String[] args) {
		System.out.println(new Solution().lengthOfLongestSubstring("ckilbkd"));
	}
}