package com.LeetCode.code.q745.FindSmallestLetterGreaterThanTarget;
/**
 * @QuestionId	:	745
 * @difficulty	:	Easy
 * @Title	 	:	Find Smallest Letter Greater Than Target
 * @TranslatedTitle:寻找比目标字母大的最小字母
 * @url			:	https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target/
 * @TranslatedContent:给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
	
	数组里字母的顺序是循环的。举个例子，如果目标字母target = &#39;z&#39; 并且有序数组为 letters = [&#39;a&#39;, &#39;b&#39;]，则答案返回 &#39;a&#39;。
	
	示例:
	
	
	输入:
	letters = ["c", "f", "j"]
	target = "a"
	输出: "c"
	
	输入:
	letters = ["c", "f", "j"]
	target = "c"
	输出: "f"
	
	输入:
	letters = ["c", "f", "j"]
	target = "d"
	输出: "f"
	
	输入:
	letters = ["c", "f", "j"]
	target = "g"
	输出: "j"
	
	输入:
	letters = ["c", "f", "j"]
	target = "j"
	输出: "c"
	
	输入:
	letters = ["c", "f", "j"]
	target = "k"
	输出: "c"
	
	
	注:
	
	
		letters长度范围在[2, 10000]区间内。
		letters 仅由小写字母组成，最少包含两个不同的字母。
		目标字母target 是一个小写字母。
	
	
 */
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
    }
}