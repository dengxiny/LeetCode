package com.LeetCode.code.q1105.UncrossedLines;
/**
 * @QuestionId	:	1105
 * @difficulty	:	Medium
 * @Title	 	:	Uncrossed Lines
 * @TranslatedTitle:不相交的线
 * @url			:	https://leetcode-cn.com/problems/uncrossed-lines/
 * @TranslatedContent:我们在两条独立的水平线上按给定的顺序写下 A 和 B 中的整数。
	
	现在，我们可以绘制一些连接两个数字 A[i] 和 B[j] 的直线，只要 A[i] == B[j]，且我们绘制的直线不与任何其他连线（非水平线）相交。
	
	以这种方法绘制线条，并返回我们可以绘制的最大连线数。
	
	 
	
	示例 1：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/04/28/142.png" style="height: 72px; width: 100px;">
	
	输入：A = [1,4,2], B = [1,2,4]
	输出：2
	解释：
	我们可以画出两条不交叉的线，如上图所示。
	我们无法画出第三条不相交的直线，因为从 A[1]=4 到 B[2]=4 的直线将与从 A[2]=2 到 B[1]=2 的直线相交。
	
	示例 2：
	
	输入：A = [2,5,1,2,5], B = [10,5,2,1,5,2]
	输出：3
	
	
	示例 3：
	
	输入：A = [1,3,7,1,7,5], B = [1,9,2,5,1]
	输出：2
	
	 
	
	提示：
	
	
		1 <= A.length <= 500
		1 <= B.length <= 500
		1 <= A[i], B[i] <= 2000
	
	
	 
	
 */
class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        
    }
}