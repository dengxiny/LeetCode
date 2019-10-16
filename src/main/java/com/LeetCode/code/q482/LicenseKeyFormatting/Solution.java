package com.LeetCode.code.q482.LicenseKeyFormatting;

import freemarker.template.utility.StringUtil;

/**
 * @QuestionId	:	482
 * @difficulty	:	Easy
 * @Title	 	:	License Key Formatting
 * @TranslatedTitle:密钥格式化
 * @url			:	https://leetcode-cn.com/problems/license-key-formatting/
 * @TranslatedContent:给定一个密钥字符串S，只包含字母，数字以及 '-'（破折号）。N 个 '-' 将字符串分成了 N+1 组。给定一个数字 K，重新格式化字符串，除了第一个分组以外，每个分组要包含 K 个字符，第一个分组至少要包含 1 个字符。两个分组之间用 '-'（破折号）隔开，并且将所有的小写字母转换为大写字母。
	
	给定非空字符串 S 和数字 K，按照上面描述的规则进行格式化。
	
	示例 1：
	
	
	输入：S = "5F3Z-2e-9-w", K = 4
	
	输出："5F3Z-2E9W"
	
	解释：字符串 S 被分成了两个部分，每部分 4 个字符；
	     注意，两个额外的破折号需要删掉。
	
	
	示例 2：
	
	
	输入：S = "2-5g-3-J", K = 2
	
	输出："2-5G-3J"
	
	解释：字符串 S 被分成了 3 个部分，按照前面的规则描述，第一部分的字符可以少于给定的数量，其余部分皆为 2 个字符。
	
	
	 
	
	提示:
	
	
		S 的长度不超过 12,000，K 为正整数
		S 只包含字母数字（a-z，A-Z，0-9）以及破折号'-'
		S 非空
	
	
	 
	
 */
class Solution {
    public String licenseKeyFormatting(String S, int K) {
    	String s1 = S.toUpperCase().replace("-", "");
    	if(s1.length()<K) {
    		return s1;
    	}
    	String s2 ="";
    	for (int i = 0; i < s1.length()/K; i++) {
			s2="-"+s1.substring(s1.length()-K*(i+1),s1.length()-K*(i))+s2;
		}
    	if(s1.length()%K>0) {
    		s2=s1.substring(0,s1.length()-K*(s1.length()/K))+s2;
    		return s2;
    	}
        return s2.substring(1,s2.length());
    }
    
    /**
     * string 太慢 改用StringBuilder
     * @param S
     * @param K
     * @return
     */
    public String licenseKeyFormatting2(String S, int K) {
    	char[] c = S.toCharArray();
    	int count = 0;
    	StringBuilder sb = new StringBuilder();
    	for (int i = S.length()-1; i >= 0; i--) {
			if(c[i]=='-') {
				continue;
			}
			if(count%K==0&&count!=0) {
				sb.append('-');
			}
			sb.append(c[i]);
			count++;
		}
    	return sb.reverse().toString().toUpperCase();
    }
    
    public static void main(String[] args) {
    	System.out.println();
    	System.out.println(new Solution().licenseKeyFormatting("2-4A0r7-4k", 4));
		System.out.println(new Solution().licenseKeyFormatting("2-5g-3-J", 2));
		System.out.println(new Solution().licenseKeyFormatting("2-5g-3-J", 2));
		System.out.println(new Solution().licenseKeyFormatting2("2-4A0r7-4k", 4));
		System.out.println(new Solution().licenseKeyFormatting2("2-5g-3-J", 2));
	}
}