package com.LeetCode.code.q520.DetectCapital;
/**
 * @QuestionId	:	520
 * @difficulty	:	Easy
 * @Title	 	:	Detect Capital
 * @TranslatedTitle:检测大写字母
 * @url			:	https://leetcode-cn.com/problems/detect-capital/
 * @TranslatedContent:给定一个单词，你需要判断单词的大写使用是否正确。
	
	我们定义，在以下情况时，单词的大写用法是正确的：
	
	
		全部字母都是大写，比如"USA"。
		单词中所有字母都不是大写，比如"leetcode"。
		如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
	
	
	否则，我们定义这个单词没有正确使用大写字母。
	
	示例 1:
	
	
	输入: "USA"
	输出: True
	
	
	示例 2:
	
	
	输入: "FlaG"
	输出: False
	
	
	注意: 输入是由大写和小写拉丁字母组成的非空单词。
	
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        char[] c = word.toCharArray();
        int up = 0, low = 0; 
        for (char d : c) {
			if(d>90) {
				low++;
			}else {
				up++;
			}
		}		
        if(low==word.length()||up==word.length()||(c[0]<'a'&&up==1)) {
        	return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().detectCapitalUse("91"));
	}
}