package com.LeetCode.code.q874.BackspaceStringCompare;
/**
 * @QuestionId	:	874
 * @difficulty	:	Easy
 * @Title	 	:	Backspace String Compare
 * @TranslatedTitle:比较含退格的字符串
 * @url			:	https://leetcode-cn.com/problems/backspace-string-compare/
 * @TranslatedContent:给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
	
	 
	
	示例 1：
	
	输入：S = "ab#c", T = "ad#c"
	输出：true
	解释：S 和 T 都会变成 &ldquo;ac&rdquo;。
	
	
	示例 2：
	
	输入：S = "ab##", T = "c#d#"
	输出：true
	解释：S 和 T 都会变成 &ldquo;&rdquo;。
	
	
	示例 3：
	
	输入：S = "a##c", T = "#a#c"
	输出：true
	解释：S 和 T 都会变成 &ldquo;c&rdquo;。
	
	
	示例 4：
	
	输入：S = "a#c", T = "b"
	输出：false
	解释：S 会变成 &ldquo;c&rdquo;，但 T 仍然是 &ldquo;b&rdquo;。
	
	 
	
	提示：
	
	
		1 <= S.length <= 200
		1 <= T.length <= 200
		S 和 T 只含有小写字母以及字符 &#39;#&#39;。
	
	
	 
	
 */
class Solution {
    public boolean backspaceCompare(String S, String T) {
        
    }
}