package com.LeetCode.code.q599.MinimumIndexSumofTwoLists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @QuestionId	:	599
 * @difficulty	:	Easy
 * @Title	 	:	Minimum Index Sum of Two Lists
 * @TranslatedTitle:两个列表的最小索引总和
 * @url			:	https://leetcode-cn.com/problems/minimum-index-sum-of-two-lists/
 * @TranslatedContent:假设Andy和Doris想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
	
	你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设总是存在一个答案。
	
	示例 1:
	
	输入:
	["Shogun", "Tapioca Express", "Burger King", "KFC"]
	["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
	输出: ["Shogun"]
	解释: 他们唯一共同喜爱的餐厅是&ldquo;Shogun&rdquo;。
	
	
	示例 2:
	
	输入:
	["Shogun", "Tapioca Express", "Burger King", "KFC"]
	["KFC", "Shogun", "Burger King"]
	输出: ["Shogun"]
	解释: 他们共同喜爱且具有最小索引和的餐厅是&ldquo;Shogun&rdquo;，它有最小的索引和1(0+1)。
	
	
	提示:
	
	
		两个列表的长度范围都在 [1, 1000]内。
		两个列表中的字符串的长度将在[1，30]的范围内。
		下标从0开始，到列表的长度减1。
		两个列表都没有重复的元素。
	
	
 */
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
    	List<String> list = new ArrayList<>();
    	if(list1.length<list2.length) {
    		String[] temp = list1; 
    		list1 = list2 ;
    		list2 = temp;
    	}
    	for (String string : list2) {
			list.add(string);
		}
    	//Map<String, Integer> map = new HashMap<String, Integer>();
    	String[] s = new String[list1.length+list2.length];
    	System.out.println(s[0]);
    	for (int i = 0; i < list1.length; i++) {
    		int index = list.indexOf(list1[i]);
    		System.out.println(index);
			if(index !=-1) {
				index +=i;
				s[index] =s[index] == null ?list1[i]:s[index]+","+list1[i];
			}
		}
    	String[] s2 = new String[] {};
    	for (int i = 0; i < s.length; i++) {
			if(s[i]!=null) {
				s2 = s[i].split(",");
				break;
			}
		}
        return s2 ;
    }
    /**
     * 官方
     * @param list1
     * @param list2
     * @return
     */
    public String[] findRestaurant2(String[] list1, String[] list2) {
        HashMap < String, Integer > map = new HashMap < String, Integer > ();
        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], i);
        List < String > res = new ArrayList < > ();
        int min_sum = Integer.MAX_VALUE, sum;
        for (int j = 0; j < list2.length && j <= min_sum; j++) {
            if (map.containsKey(list2[j])) {
                sum = j + map.get(list2[j]);
                if (sum < min_sum) {
                    res.clear();
                    res.add(list2[j]);
                    min_sum = sum;
                } else if (sum == min_sum)
                    res.add(list2[j]);
            }
        }
        return res.toArray(new String[res.size()]);
    }

    
    public static void main(String[] args) {
		System.out.println(new Solution().findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"
			}, new String[]{"KFC","Burger King","Tapioca Express","Shogun"}));
	}
}