package com.LeetCode.code.q962.FlipStringtoMonotoneIncreasing;
/**
 * @QuestionId	:	962
 * @difficulty	:	Medium
 * @Title	 	:	Flip String to Monotone Increasing
 * @TranslatedTitle:将字符串翻转到单调递增
 * @url			:	https://leetcode-cn.com/problems/flip-string-to-monotone-increasing/
 * @TranslatedContent:如果一个由 &#39;0&#39; 和 &#39;1&#39; 组成的字符串，是以一些 &#39;0&#39;（可能没有 &#39;0&#39;）后面跟着一些 &#39;1&#39;（也可能没有 &#39;1&#39;）的形式组成的，那么该字符串是单调递增的。
	
	我们给出一个由字符 &#39;0&#39; 和 &#39;1&#39; 组成的字符串 S，我们可以将任何 &#39;0&#39; 翻转为 &#39;1&#39; 或者将 &#39;1&#39; 翻转为 &#39;0&#39;。
	
	返回使 S 单调递增的最小翻转次数。
	
	 
	
	示例 1：
	
	输入："00110"
	输出：1
	解释：我们翻转最后一位得到 00111.
	
	
	示例 2：
	
	输入："010110"
	输出：2
	解释：我们翻转得到 011111，或者是 000111。
	
	
	示例 3：
	
	输入："00011000"
	输出：2
	解释：我们翻转得到 00000000。
	
	
	 
	
	提示：
	
	
		1 <= S.length <= 20000
		S 中只包含字符 &#39;0&#39; 和 &#39;1&#39;
	
	
 */
class Solution {
    public int minFlipsMonoIncr(String S) {
        
    }
}