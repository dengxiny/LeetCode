package com.LeetCode.code.q401.BinaryWatch;

import java.util.ArrayList;
import java.util.List;

/**
 * @QuestionId	:	401
 * @difficulty	:	Easy
 * @Title	 	:	Binary Watch
 * @TranslatedTitle:二进制手表
 * @url			:	https://leetcode-cn.com/problems/binary-watch/
 * @TranslatedContent:二进制手表顶部有 4 个 LED 代表小时（0-11），底部的 6 个 LED 代表分钟（0-59）。
	
	每个 LED 代表一个 0 或 1，最低位在右侧。
	
	<img src="https://upload.wikimedia.org/wikipedia/commons/8/8b/Binary_clock_samui_moon.jpg" style="height:300px" />
	
	例如，上面的二进制手表读取 &ldquo;3:25&rdquo;。
	
	给定一个非负整数 n 代表当前 LED 亮着的数量，返回所有可能的时间。
	
	案例:
	
	
	输入: n = 1
	返回: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
	
	 
	
	注意事项:
	
	
		输出的顺序没有要求。
		小时不会以零开头，比如 &ldquo;01:00&rdquo; 是不允许的，应为 &ldquo;1:00&rdquo;。
		分钟必须由两位数组成，可能会以零开头，比如 &ldquo;10:2&rdquo; 是无效的，应为 &ldquo;10:02&rdquo;。
	
	
 */
class Solution {
    public List<String> readBinaryWatch(int num) {
    	List<String> list = new ArrayList<String>();
    	for (int i = 0; i < 12; i++) {
			String s = String.valueOf(i);
			for (int j = 0; j < 60; j++) {
				String s1 = String.format("%02d", j);
				if(check(i,j,num)) {
					list.add(s+":"+s1);
				}
			}
		}
		return list;
        
    }
    
    
    public boolean check(int i,int j ,int num) {
    	int index = -1;
    	int count = 0;
    	String s = Integer.toBinaryString(i);
    	for (int k = 0; k < s.length(); k++) {
			index = s.indexOf("1",index+1);
			if(index==-1) {
				break;
			}
			count++;
		}
    	index = -1;
    	String s1 = Integer.toBinaryString(j);
    	for (int k = 0; k < s1.length(); k++) {
			index = s1.indexOf("1",index+1);
			if(index==-1) {
				break;
			}
			count++;
		}
    	if(count==num) {
    		return true;
    	}
    	return false;
    }
    
    /**
     * 用bigcount 先左移给分让6位 统计1的个数
     * 01:23
     * 01:10111 1010111
     * @param num
     * @return
     */
    public List<String> readBinaryWatch_2(int num) {
    	List<String> resList = new ArrayList<>();
    	for (int i = 0; i < 12; ++i)
    	      for (int j = 0; j < 60; ++j)
    		if (Integer.bitCount((i << 6) | j) == num)
    			resList.add(i + ":" + (j > 9 ? "" : "0") + j);
    	return resList;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().readBinaryWatch(2));
		//System.out.println(new Solution().check(7, 0, 2));
	}
}