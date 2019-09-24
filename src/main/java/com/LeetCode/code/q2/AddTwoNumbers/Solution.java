package com.LeetCode.code.q2.AddTwoNumbers;

import java.util.HashMap;
import java.util.Map;

/**
 * @QuestionId	:	2
 * @difficulty	:	Medium
 * @Title	 	:	Add Two Numbers
 * @TranslatedTitle:两数相加
 * @url			:	https://leetcode-cn.com/problems/add-two-numbers/
 * @TranslatedContent:给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
	
	如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
	
	您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
	
	示例：
	
	输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
	输出：7 -> 0 -> 8
	原因：342 + 465 = 807
	
	
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

	public class ListNode {
	   int val;
	   ListNode next;
	   ListNode(int x) { val = x; }
	}
	 
	/**
	 * 逻辑：
	 * 1 : l → result , result.next = new ListNode(sum%10) , l → l.next = result.next
	 * 2 : l → result.next , result.next.next = new ListNode(sum%10) , l → l.next = result.next.next
	 * @param l1
	 * @param l2
	 * @return
	 */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode result = new ListNode(0);
    	ListNode l = result,p = l1,q = l2;
    	int count = 0;
    	while (p!=null && q!=null) {
			int x = (p==null)? 0:p.val;
			int y = (q==null)? 0:q.val;
			int sum = x + y + count;
			l.next = new ListNode(sum%10);
			count = sum/10;
			p = (p==null)? p:p.next;
			q = (p==null)? q:q.next;
			l = l.next;
		}
    	return result.next;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	ListNode l1 = s.new ListNode(2);
    	l1.next = s.new ListNode(4);
    	l1.next.next = s.new ListNode(3); 
    	ListNode l2 = s.new ListNode(5);
    	l2.next = s.new ListNode(6);
    	l2.next.next = s.new ListNode(4); 
    	ListNode l = s.addTwoNumbers(l1, l2);
    	while(l!=null) {
    		System.out.println(l.val);
    		l = l.next; 
    	}
    	ListNode l3 = l1;
    	l3.next = s.new ListNode(0);
    	ListNode l4 = l1;
    	while(l4!=null) {
    		System.out.println(l4.val);
    		l4 = l4.next; 
    	}
	}
}