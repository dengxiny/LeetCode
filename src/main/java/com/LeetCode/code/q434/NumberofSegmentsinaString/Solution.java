package com.LeetCode.code.q434.NumberofSegmentsinaString;
/**
 * @QuestionId	:	434
 * @difficulty	:	Easy
 * @Title	 	:	Number of Segments in a String
 * @TranslatedTitle:字符串中的单词数
 * @url			:	https://leetcode-cn.com/problems/number-of-segments-in-a-string/
 * @TranslatedContent:统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。
	
	请注意，你可以假定字符串里不包括任何不可打印的字符。
	
	示例:
	
	输入: "Hello, my name is John"
	输出: 5
	
	
 */
class Solution {
/*    public int countSegments(String s) {
        return s.replace("", newChar)
    }*/
    
    public int countSegments(String s) {
        int segmentCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount;
    }
    
    public int countSegments2(String s) {
        String trimmed = s.trim();
        if (trimmed.equals("")) {
            return 0;
        }
        return trimmed.split("\\s+").length;
    }


    
    public static void main(String[] args) {
		System.out.println(new Solution().countSegments2(" Hello  , my name  is John "));
	}
}