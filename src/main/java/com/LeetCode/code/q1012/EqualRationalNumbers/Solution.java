package com.LeetCode.code.q1012.EqualRationalNumbers;
/**
 * @QuestionId	:	1012
 * @difficulty	:	Hard
 * @Title	 	:	Equal Rational Numbers
 * @TranslatedTitle:相等的有理数
 * @url			:	https://leetcode-cn.com/problems/equal-rational-numbers/
 * @TranslatedContent:给定两个字符串 S 和 T，每个字符串代表一个非负有理数，只有当它们表示相同的数字时才返回 true；否则，返回 false。字符串中可以使用括号来表示有理数的重复部分。
	
	通常，有理数最多可以用三个部分来表示：整数部分 、小数非重复部分  和小数重复部分 <(><)>。数字可以用以下三种方法之一来表示：
	
	
		（例：0，12，123）
		<.> （例：0.5，2.12，2.0001）
		<.><(><)>（例：0.1(6)，0.9(9)，0.00(1212)）
	
	
	十进制展开的重复部分通常在一对圆括号内表示。例如：
	
	1 / 6 = 0.16666666... = 0.1(6) = 0.1666(6) = 0.166(66)
	
	0.1(6) 或 0.1666(6) 或 0.166(66) 都是 1 / 6 的正确表示形式。
	
	 
	
	示例 1：
	
	输入：S = "0.(52)", T = "0.5(25)"
	输出：true
	解释：因为 "0.(52)" 代表 0.52525252...，而 "0.5(25)" 代表 0.52525252525.....，则这两个字符串表示相同的数字。
	
	
	示例 2：
	
	输入：S = "0.1666(6)", T = "0.166(66)"
	输出：true
	
	
	示例 3：
	
	输入：S = "0.9(9)", T = "1."
	输出：true
	解释：
	"0.9(9)" 代表 0.999999999... 永远重复，等于 1 。[<a href="https://baike.baidu.com/item/0.999…/5615429?fr=aladdin" target="_blank">有关说明，请参阅此链接]
	"1." 表示数字 1，其格式正确：(IntegerPart) = "1" 且 (NonRepeatingPart) = "" 。
	
	 
	
	提示：
	
	
		每个部分仅由数字组成。
		整数部分  不会以 2 个或更多的零开头。（对每个部分的数字没有其他限制）。
		1 <= .length <= 4 
		0 <= .length <= 4 
		1 <= .length <= 4 
	
	
 */
class Solution {
    public boolean isRationalEqual(String S, String T) {
        
    }
}