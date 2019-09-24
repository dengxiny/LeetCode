package com.LeetCode.code.q138.CopyListwithRandomPointer;
/**
 * @QuestionId	:	138
 * @difficulty	:	Medium
 * @Title	 	:	Copy List with Random Pointer
 * @TranslatedTitle:复制带随机指针的链表
 * @url			:	https://leetcode-cn.com/problems/copy-list-with-random-pointer/
 * @TranslatedContent:给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
	
	要求返回这个链表的<a href="https://baike.baidu.com/item/深拷贝/22785317?fr=aladdin" target="_blank">深拷贝。 
	
	 
	
	示例：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/1470150906153-2yxeznm.png">
	
	输入：
	{"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}
	
	解释：
	节点 1 的值是 1，它的下一个指针和随机指针都指向节点 2 。
	节点 2 的值是 2，它的下一个指针指向 null，随机指针指向它自己。
	
	
	 
	
	提示：
	
	
		你必须返回给定头的拷贝作为对克隆列表的引用。
	
	
 */
/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        
    }
}