package com.LeetCode.code.q506.RelativeRanks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @QuestionId	:	506
 * @difficulty	:	Easy
 * @Title	 	:	Relative Ranks
 * @TranslatedTitle:相对名次
 * @url			:	https://leetcode-cn.com/problems/relative-ranks/
 * @TranslatedContent:给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 &ldquo;金牌&rdquo;，&ldquo;银牌&rdquo; 和&ldquo; 铜牌&rdquo;（"Gold Medal", "Silver Medal", "Bronze Medal"）。
	
	(注：分数越高的选手，排名越靠前。)
	
	示例 1:
	
	
	输入: [5, 4, 3, 2, 1]
	输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
	解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 &ldquo;金牌&rdquo;，&ldquo;银牌&rdquo;和&ldquo;铜牌&rdquo; ("Gold Medal", "Silver Medal" and "Bronze Medal").
	余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。
	
	提示:
	
	
		N 是一个正整数并且不会超过 10000。
		所有运动员的成绩都不相同。
	
	
 */
class Solution {
    public String[] findRelativeRanks(int[] nums) {
    	List<Integer> list = new ArrayList<>();
    	for (int i : nums) {
    		list.add(i);
		}
    	list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1<o2) {
					return 1;
				}else if(o1>o2) {
					return -1;
				}
				return 0;
			}
		});
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]==list.get(0)) {
				s[i]="Gold Medal";
			}else if (nums[i]==list.get(1)) {
				s[i]="Silver Medal";
			}else if (nums[i]==list.get(2)) {
				s[i]="Bronze Medal";
			}else {
				s[i]=String.valueOf(list.indexOf(nums[i])+1);
			}
		}
        return s;
    }
    
    public static void main(String[] args) {
		System.out.println(Arrays.asList(new Solution().findRelativeRanks(new int[] {10,3,8,9,4})));
	}
}