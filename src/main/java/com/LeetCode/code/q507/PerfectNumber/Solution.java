package com.LeetCode.code.q507.PerfectNumber;
/**
 * @QuestionId	:	507
 * @difficulty	:	Easy
 * @Title	 	:	Perfect Number
 * @TranslatedTitle:完美数
 * @url			:	https://leetcode-cn.com/problems/perfect-number/
 * @TranslatedContent:对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为&ldquo;完美数&rdquo;。
	
	给定一个 整数 n， 如果他是完美数，返回 True，否则返回 False
	
	 
	
	示例：
	
	输入: 28
	输出: True
	解释: 28 = 1 + 2 + 4 + 7 + 14
	
	
	 
	
	提示：
	
	输入的数字 n 不会超过 100,000,000. (1e8)
	
 */
class Solution {
	/**
	 * 超时 
	 * 改成开方再通过除法求另一个因子
	 * @param num
	 * @return
	 */
    public boolean checkPerfectNumber(int num) {
    	int sum = 1;
    	int tem = 1;
        while(tem++<Math.sqrt((long)num)-1) {
        	if(num%tem==0) {
        		sum+=(tem+num/tem);
        	}
        }
        if(sum==num&&sum!=1) {
        	return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().checkPerfectNumber(28));
	}
}
