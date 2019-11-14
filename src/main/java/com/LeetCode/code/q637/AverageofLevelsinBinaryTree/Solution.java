package com.LeetCode.code.q637.AverageofLevelsinBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @QuestionId	:	637
 * @difficulty	:	Easy
 * @Title	 	:	Average of Levels in Binary Tree
 * @TranslatedTitle:二叉树的层平均值
 * @url			:	https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/
 * @TranslatedContent:给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
	
	示例 1:
	
	输入:
	    3
	   / \
	  9  20
	    /  \
	   15   7
	输出: [3, 14.5, 11]
	解释:
	第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
	
	
	注意：
	
	
		节点值的范围在32位有符号整数范围内。
	
	
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
    public List<Double> averageOfLevels(TreeNode root) {
    	if(root == null) {
    		return null;
    	}
    	List<Double> list = new ArrayList<Double>();
    //list.add(new Double(root.val));
    	int size = 1 ;
    	LinkedList<TreeNode> que = new LinkedList<TreeNode>();
    	que.add(root);
    	while(que.size()>0) {
    		double sum = 0;
    		int len = que.size();
    		for (int i = 0; i < len; i++) {
    			TreeNode pre = que.poll();
    			sum+=pre.val;
    			if(pre.left!=null) {
    				que.add(pre.left);
    			}
    			if(pre.right!=null) {
    				que.add(pre.right);
    			}
			}
    		list.add(sum/len);
    	}
    	return list;
    }
    	
    public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode  t = s.new TreeNode(3);
		t.left = s.new TreeNode(9);
		t.right = s.new TreeNode(20);
		t.right.left = s.new TreeNode(15);
		t.right.right = s.new TreeNode(7);
		System.out.println(s.averageOfLevels(t).toString());
	}	
}