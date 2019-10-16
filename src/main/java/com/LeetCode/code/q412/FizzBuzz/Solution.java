package com.LeetCode.code.q412.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * @QuestionId	:	412
 * @difficulty	:	Easy
 * @Title	 	:	Fizz Buzz
 * @TranslatedTitle:Fizz Buzz
 * @url			:	https://leetcode-cn.com/problems/fizz-buzz/
 * @TranslatedContent:写一个程序，输出从 1 到 n 数字的字符串表示。
	
	1. 如果 n 是3的倍数，输出&ldquo;Fizz&rdquo;；
	
	2. 如果 n 是5的倍数，输出&ldquo;Buzz&rdquo;；
	
	3.如果 n 同时是3和5的倍数，输出 &ldquo;FizzBuzz&rdquo;。
	
	示例：
	
	n = 15,
	
	返回:
	[
	    "1",
	    "2",
	    "Fizz",
	    "4",
	    "Buzz",
	    "Fizz",
	    "7",
	    "8",
	    "Fizz",
	    "Buzz",
	    "11",
	    "Fizz",
	    "13",
	    "14",
	    "FizzBuzz"
	]
	
	
 */
class Solution {
    public List<String> fizzBuzz(int n) {
    	List<String> list = new ArrayList<String>();
    	for (int i = 1; i <= n ; i++) {
    		String s = "";
			if(i%3==0) {
				s=s.concat("Fizz");
			}
			if(i%5==0) {
				s=s.concat("Buzz");
			}
			if(s.equals("")) {
				s=s.concat(String.valueOf(i));
			}
			list.add(s);
		}
    	return list;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().fizzBuzz(3).toString());
	}
}