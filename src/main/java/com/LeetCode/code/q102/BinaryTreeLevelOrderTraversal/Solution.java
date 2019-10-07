package com.LeetCode.code.q102.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @QuestionId	:	102
 * @difficulty	:	Medium
 * @Title	 	:	Binary Tree Level Order Traversal
 * @TranslatedTitle:二叉树的层次遍历
 * @url			:	https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 * @TranslatedContent:给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
	
	例如:
	给定二叉树: [3,9,20,null,null,15,7],
	
	    3
	   / \
	  9  20
	    /  \
	   15   7
	
	
	返回其层次遍历结果：
	
	[
	  [3],
	  [9,20],
	  [15,7]
	]
	
	
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
	   
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	leveldeth(list,root,0);
    	return list;
    }
    
    public void leveldeth(List<List<Integer>> list,TreeNode root,int size) {
    	if(root == null) {
    		return ;
    	}
    	if(list.size()<=size) {
    		list.add(new ArrayList<Integer>());
    	}
    	list.get(size).add(root.val);
    	leveldeth(list,root.left,size+1);
    	leveldeth(list,root.right,size+1);
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	TreeNode root = s.new TreeNode(3);
    	root.left = s.new TreeNode(9);
    	root.right = s.new TreeNode(20);
    	root.right.left = s.new TreeNode(15);
    	root.right.right = s.new TreeNode(7);
		System.out.println(s.levelOrder(root));
	}
}