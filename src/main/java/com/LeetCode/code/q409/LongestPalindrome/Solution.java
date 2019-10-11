package com.LeetCode.code.q409.LongestPalindrome;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @QuestionId	:	409
 * @difficulty	:	Easy
 * @Title	 	:	Longest Palindrome
 * @TranslatedTitle:最长回文串
 * @url			:	https://leetcode-cn.com/problems/longest-palindrome/
 * @TranslatedContent:给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
	
	在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
	
	注意:<br />
	假设字符串的长度不会超过 1010。
	
	示例 1: 
	
	
	输入:
	"abccccdd"
	
	输出:
	7
	
	解释:
	我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
	
	
 */
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char i : s.toCharArray()) {
			map.put(i, map.get(i)==null?1:map.get(i)+1);
		}
        int size=0;
        boolean flag=false;
        for (Character entry : map.keySet()) {
        	Integer value = map.get(entry);
        	if(value/2>0) {
        		size=size+value/2*2;
        	}else {
        		flag=true;
        	}
		}
        return flag?size+1:size<s.length()?size+1:size;
    }
    
    public int longestPalindrome2(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (v % 2 == 1 && ans % 2 == 0)
                ans++;
        }
        return ans;
    }


    
    public static void main(String[] args) {
    	System.out.println(1/2);
		System.out.println(new Solution().longestPalindrome("aA"));
		System.out.println(new Solution().longestPalindrome("bb"));
		System.out.println(new Solution().longestPalindrome("ccccddab"));
		System.out.println(new Solution().longestPalindrome("ccc"));
		System.out.println(new Solution().longestPalindrome("cccbbb"));
    }
}