package com.LeetCode.code.q793.SwapAdjacentinLRString;
/**
 * @QuestionId	:	793
 * @difficulty	:	Medium
 * @Title	 	:	Swap Adjacent in LR String
 * @TranslatedTitle:在LR字符串中交换相邻字符
 * @url			:	https://leetcode-cn.com/problems/swap-adjacent-in-lr-string/
 * @TranslatedContent:在一个由 &#39;L&#39; , &#39;R&#39; 和 &#39;X&#39; 三个字符组成的字符串（例如"RXXLRXRXL"）中进行移动操作。一次移动操作指用一个"LX"替换一个"XL"，或者用一个"XR"替换一个"RX"。现给定起始字符串start和结束字符串end，请编写代码，当且仅当存在一系列移动操作使得start可以转换成end时， 返回True。
	
	示例 :
	
	
	输入: start = "RXXLRXRXL", end = "XRLXXRRLX"
	输出: True
	解释:
	我们可以通过以下几步将start转换成end:
	RXXLRXRXL ->
	XRXLRXRXL ->
	XRLXRXRXL ->
	XRLXXRRXL ->
	XRLXXRRLX
	
	
	注意:
	
	
		1 <= len(start) = len(end) <= 10000。
		start和end中的字符串仅限于&#39;L&#39;, &#39;R&#39;和&#39;X&#39;。
	
	
 */
class Solution {
    public boolean canTransform(String start, String end) {
        
    }
}