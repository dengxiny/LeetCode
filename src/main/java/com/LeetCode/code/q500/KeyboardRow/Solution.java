package com.LeetCode.code.q500.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

/**
 * @QuestionId	:	500
 * @difficulty	:	Easy
 * @Title	 	:	Keyboard Row
 * @TranslatedTitle:键盘行
 * @url			:	https://leetcode-cn.com/problems/keyboard-row/
 * @TranslatedContent:给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
	
	 
	
	<img alt="American keyboard" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/keyboard.png" style="width: 100%; max-width: 600px">
	
	 
	
	示例：
	
	输入: ["Hello", "Alaska", "Dad", "Peace"]
	输出: ["Alaska", "Dad"]
	
	
	 
	
	注意：
	
	
		你可以重复使用键盘上同一字符。
		你可以假设输入的字符串将只包含字母。
	
 */
class Solution {
    public String[] findWords(String[] words) {
    	String[] rec=new String[3];
        rec[0]="qwertyuiop";
        rec[1]="asdfghjkl";
        rec[2]="zxcvbnm";
        List<String> list=new ArrayList<>();
        for(String str:words){
            for(int j=0;j<3;j++){
                boolean flag=true;
                for(int k=0;k<str.length();k++){
                    char ch=str.charAt(k);
                    if(ch>='A'&&ch<='Z')ch=(char)(ch+32);
                    if(rec[j].indexOf(ch)==-1){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    list.add(str);
                    break;
                }  
            }
        }   
        return list.toArray(new String[]{});
    }
}