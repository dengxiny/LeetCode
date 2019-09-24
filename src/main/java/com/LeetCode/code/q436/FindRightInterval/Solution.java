package com.LeetCode.code.q436.FindRightInterval;
/**
 * @QuestionId	:	436
 * @difficulty	:	Medium
 * @Title	 	:	Find Right Interval
 * @TranslatedTitle:寻找右区间
 * @url			:	https://leetcode-cn.com/problems/find-right-interval/
 * @TranslatedContent:给定一组区间，对于每一个区间 i，检查是否存在一个区间 j，它的起始点大于或等于区间 i 的终点，这可以称为 j 在 i 的&ldquo;右侧&rdquo;。
	
	对于任何区间，你需要存储的满足条件的区间 j 的最小索引，这意味着区间 j 有最小的起始点可以使其成为&ldquo;右侧&rdquo;区间。如果区间 j 不存在，则将区间 i 存储为 -1。最后，你需要输出一个值为存储的区间值的数组。
	
	注意:
	
	
		你可以假设区间的终点总是大于它的起始点。
		你可以假定这些区间都不具有相同的起始点。
	
	
	示例 1:
	
	
	输入: [ [1,2] ]
	输出: [-1]
	
	解释:集合中只有一个区间，所以输出-1。
	
	
	示例 2:
	
	
	输入: [ [3,4], [2,3], [1,2] ]
	输出: [-1, 0, 1]
	
	解释:对于[3,4]，没有满足条件的&ldquo;右侧&rdquo;区间。
	对于[2,3]，区间[3,4]具有最小的&ldquo;右&rdquo;起点;
	对于[1,2]，区间[2,3]具有最小的&ldquo;右&rdquo;起点。
	
	
	示例 3:
	
	
	输入: [ [1,4], [2,3], [3,4] ]
	输出: [-1, 2, -1]
	
	解释:对于区间[1,4]和[3,4]，没有满足条件的&ldquo;右侧&rdquo;区间。
	对于[2,3]，区间[3,4]有最小的&ldquo;右&rdquo;起点。
	
	
 */
class Solution {
    public int[] findRightInterval(int[][] intervals) {
        
    }
}