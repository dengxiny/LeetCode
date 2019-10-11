package com.LeetCode.code.q383.RansomNote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @QuestionId	:	383
 * @difficulty	:	Easy
 * @Title	 	:	Ransom Note
 * @TranslatedTitle:赎金信
 * @url			:	https://leetcode-cn.com/problems/ransom-note/
 * @TranslatedContent:给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
	
	(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
	
	注意：
	
	你可以假设两个字符串均只含有小写字母。
	
	
	canConstruct("a", "b") -> false
	canConstruct("aa", "ab") -> false
	canConstruct("aa", "aab") -> true
	
	
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    	List<Character> list = new ArrayList<Character>();
    	for (char i :  magazine.toCharArray()) {
    		list.add(i);
		}
        for (char i : ransomNote.toCharArray()) {
			if(!list.contains(i)) {
				return false;
			}else {
				list.remove(list.indexOf(i));
			}
		}
        return true;
    }
    
    public boolean canConstruct2(String ransomNote, String magazine) {
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	for (char i :  magazine.toCharArray()) {
    		map.put(i, map.get(i)==null?0:map.get(i)+1);
		}
        for (char i : ransomNote.toCharArray()) {
			if(!map.containsKey(i)) {
				return false;
			}else {
				int size = map.get(i)-1;
				if(size<-1) {
					return false;
				}
				map.put(i, size);
			}
		}
        return true;
    }
    
    /**
     * 均含小写默认26个小写 桶排序
     * abcd
     * 0000
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct3(String ransomNote, String magazine) {
	    int[] buckets = new int[26];
	    for(int i = 0; i < magazine.length(); i++) {
	        buckets[magazine.charAt(i) - 'a']++;
	    }
	    for(int i = 0; i < ransomNote.length(); i++) {
	        if(--buckets[ransomNote.charAt(i) - 'a'] < 0) {
	            return false;
	        }
	    }
	    return true;
    }

    
    public static void main(String[] args) {
		System.out.println(new Solution().canConstruct3("aa","aab"));
	}
}