package com.LeetCode.code.q371.SumofTwoIntegers;
/**
 * @QuestionId	:	371
 * @difficulty	:	Easy
 * @Title	 	:	Sum of Two Integers
 * @TranslatedTitle:两整数之和
 * @url			:	https://leetcode-cn.com/problems/sum-of-two-integers/
 * @TranslatedContent:不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
	
	示例 1:
	
	输入: a = 1, b = 2
	输出: 3
	
	
	示例 2:
	
	输入: a = -2, b = 3
	输出: 1
	
 */
class Solution {
//	利用位操作实现加法
//
//	首先看十进制是如何做的： 5+7=12，三步走
//
//	    第一步：相加各位的值，不算进位，得到2。
//	    第二步：计算进位值，得到10. 如果这一步的进位值为0，那么第一步得到的值就是最终结果。
//	    第三步：重复上述两步，只是相加的值变成上述两步的得到的结果2和10，得到12。
//
//	同样我们可以用三步走的方式计算二进制值相加： 5---101，7---111
//
//	    第一步：相加各位的值，不算进位，得到010，二进制每位相加就相当于各位做异或操作，101^111。
//	    第二步：计算进位值，得到1010，相当于各位进行与操作得到101，再向左移一位得到1010，(101&111)<<1。
//	    第三步重复上述两步，各位相加 010^1010=1000，进位值为100=(010 & 1010)<<1。
//	    继续重复上述两步：1000^100 = 1100，进位值为0，跳出循环，1100为最终结果。
//	    结束条件：进位为0，即a为最终的求和结果。


    public int getSum(int a, int b) {
        while(b != 0){
            int temp = a ^ b;
            b = (a & b) << 1;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().getSum(5, 15));
	}
}