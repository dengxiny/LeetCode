package com.LeetCode.code.q753.OpentheLock;
/**
 * @QuestionId	:	753
 * @difficulty	:	Medium
 * @Title	 	:	Open the Lock
 * @TranslatedTitle:打开转盘锁
 * @url			:	https://leetcode-cn.com/problems/open-the-lock/
 * @TranslatedContent:你有一个带有四个圆形拨轮的转盘锁。每个拨轮都有10个数字： &#39;0&#39;, &#39;1&#39;, &#39;2&#39;, &#39;3&#39;, &#39;4&#39;, &#39;5&#39;, &#39;6&#39;, &#39;7&#39;, &#39;8&#39;, &#39;9&#39; 。每个拨轮可以自由旋转：例如把 &#39;9&#39; 变为  &#39;0&#39;<font color="#333333" face="Helvetica Neue, Helvetica, Arial, sans-serif"><span style="background-color:#ffffff; font-size:14px">，&#39;0&#39; 变为 &#39;9&#39; 。每次旋转都只能旋转一个拨轮的一位数字。
	
	锁的初始数字为 &#39;0000&#39; ，一个代表四个拨轮的数字的字符串。
	
	列表 deadends 包含了一组死亡数字，一旦拨轮的数字和列表里的任何一个元素相同，这个锁将会被永久锁定，无法再被旋转。
	
	字符串 target 代表可以解锁的数字，你需要给出最小的旋转次数，如果无论如何不能解锁，返回 -1。
	
	 
	
	示例 1:
	
	
	输入：deadends = ["0201","0101","0102","1212","2002"], target = "0202"
	输出：6
	解释：
	可能的移动序列为 "0000" -> "1000" -> "1100" -> "1200" -> "1201" -> "1202" -> "0202"。
	注意 "0000" -> "0001" -> "0002" -> "0102" -> "0202" 这样的序列是不能解锁的，
	因为当拨动到 "0102" 时这个锁就会被锁定。
	
	
	示例 2:
	
	
	输入: deadends = ["8888"], target = "0009"
	输出：1
	解释：
	把最后一位反向旋转一次即可 "0000" -> "0009"。
	
	
	示例 3:
	
	
	输入: deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
	输出：-1
	解释：
	无法旋转到目标数字且不被锁定。
	
	
	示例 4:
	
	
	输入: deadends = ["0000"], target = "8888"
	输出：-1
	
	
	 
	
	提示：
	
	
		死亡列表 deadends 的长度范围为 [1, 500]。
		目标数字 target 不会在 deadends 之中。
		每个 deadends 和 target 中的字符串的数字会在 10,000 个可能的情况 &#39;0000&#39; 到 &#39;9999&#39; 中产生。
	
	
 */
class Solution {
    public int openLock(String[] deadends, String target) {
        
    }
}