package com.LeetCode.code.q551.StudentAttendanceRecordI;
/**
 * @QuestionId	:	551
 * @difficulty	:	Easy
 * @Title	 	:	Student Attendance Record I
 * @TranslatedTitle:学生出勤记录 I
 * @url			:	https://leetcode-cn.com/problems/student-attendance-record-i/
 * @TranslatedContent:给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：
	
	
		&#39;A&#39; : Absent，缺勤
		&#39;L&#39; : Late，迟到
		&#39;P&#39; : Present，到场
	
	
	如果一个学生的出勤记录中不超过一个&#39;A&#39;(缺勤)并且不超过两个连续的&#39;L&#39;(迟到),那么这个学生会被奖赏。
	
	你需要根据这个学生的出勤记录判断他是否会被奖赏。
	
	示例 1:
	
	输入: "PPALLP"
	输出: True
	
	
	示例 2:
	
	输入: "PPALLL"
	输出: False
	
	
 */
class Solution {
    public boolean checkRecord(String s) {
        char[] charry = s.toCharArray();
        int A = 0;
        for (int i = 0; i < charry.length; i++) {
			if(charry[i]=='A') {
				A++;
				if(A>1) {
					return false;
				}
			}else if(charry[i]=='L'&&i+1<charry.length&&charry[i+1]=='L'&&i+2<charry.length&&charry[i+2]=='L') {
				return false;
			}
		}
        return true;
    }
}