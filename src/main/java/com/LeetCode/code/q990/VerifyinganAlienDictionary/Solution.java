package com.LeetCode.code.q990.VerifyinganAlienDictionary;
/**
 * @QuestionId	:	990
 * @difficulty	:	Easy
 * @Title	 	:	Verifying an Alien Dictionary
 * @TranslatedTitle:验证外星语词典
 * @url			:	https://leetcode-cn.com/problems/verifying-an-alien-dictionary/
 * @TranslatedContent:某种外星语也使用英文小写字母，但可能顺序 order 不同。字母表的顺序（order）是一些小写字母的排列。
	
	给定一组用外星语书写的单词 words，以及其字母表的顺序 order，只有当给定的单词在这种外星语中按字典序排列时，返回 true；否则，返回 false。
	
	 
	
	示例 1：
	
	输入：words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
	输出：true
	解释：在该语言的字母表中，&#39;h&#39; 位于 &#39;l&#39; 之前，所以单词序列是按字典序排列的。
	
	示例 2：
	
	输入：words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
	输出：false
	解释：在该语言的字母表中，&#39;d&#39; 位于 &#39;l&#39; 之后，那么 words[0] > words[1]，因此单词序列不是按字典序排列的。
	
	示例 3：
	
	输入：words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
	输出：false
	解释：当前三个字符 "app" 匹配时，第二个字符串相对短一些，然后根据词典编纂规则 "apple" > "app"，因为 &#39;l&#39; > &#39;&empty;&#39;，其中 &#39;&empty;&#39; 是空白字符，定义为比任何其他字符都小（<a href="https://baike.baidu.com/item/%E5%AD%97%E5%85%B8%E5%BA%8F" target="_blank">更多信息）。
	
	
	 
	
	提示：
	
	
		1 <= words.length <= 100
		1 <= words[i].length <= 20
		order.length == 26
		在 words[i] 和 order 中的所有字符都是英文小写字母。
	
	
 */
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
    }
}