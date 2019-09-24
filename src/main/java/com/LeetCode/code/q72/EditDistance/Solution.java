package com.LeetCode.code.q72.EditDistance;
/**
 * @QuestionId	:	72
 * @difficulty	:	Hard
 * @Title	 	:	Edit Distance
 * @TranslatedTitle:编辑距离
 * @url			:	https://leetcode-cn.com/problems/edit-distance/
 * @TranslatedContent:给定两个单词 word1 和 word2，计算出将 word1 转换成 word2 所使用的最少操作数 。
	
	你可以对一个单词进行如下三种操作：
	
	
		插入一个字符
		删除一个字符
		替换一个字符
	
	
	示例 1:
	
	输入: word1 = "horse", word2 = "ros"
	输出: 3
	解释: 
	horse -> rorse (将 &#39;h&#39; 替换为 &#39;r&#39;)
	rorse -> rose (删除 &#39;r&#39;)
	rose -> ros (删除 &#39;e&#39;)
	
	
	示例 2:
	
	输入: word1 = "intention", word2 = "execution"
	输出: 5
	解释: 
	intention -> inention (删除 &#39;t&#39;)
	inention -> enention (将 &#39;i&#39; 替换为 &#39;e&#39;)
	enention -> exention (将 &#39;n&#39; 替换为 &#39;x&#39;)
	exention -> exection (将 &#39;n&#39; 替换为 &#39;c&#39;)
	exection -> execution (插入 &#39;u&#39;)
	
	
 */
class Solution {
    public int minDistance(String word1, String word2) {
        
    }
}