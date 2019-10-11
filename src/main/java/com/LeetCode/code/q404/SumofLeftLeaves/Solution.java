package com.LeetCode.code.q404.SumofLeftLeaves;
/**
 * @QuestionId	:	404
 * @difficulty	:	Easy
 * @Title	 	:	Sum of Left Leaves
 * @TranslatedTitle:左叶子之和
 * @url			:	https://leetcode-cn.com/problems/sum-of-left-leaves/
 * @TranslatedContent:计算给定二叉树的所有左叶子之和。
	
	示例：
	
	
	    3
	   / \
	  9  20
	    /  \
	   15   7
	
	在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
	
	 
	
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
    public int sumOfLeftLeaves(TreeNode root) {
    	int sum=0;
    	if(root==null) {
    		return sum;
    	}
    	if(isBoom(root.left)) {
    		sum+=root.left.val;
    	}
    	sum+=sumOfLeftLeaves(root.right);
    	sum+=sumOfLeftLeaves(root.left);
		return sum;
        
    }
    
    public boolean isBoom(TreeNode root) {
		return root!=null&&root.left==null&&root.right==null;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	TreeNode t = s.new TreeNode(1);
    	t.left = s.new TreeNode(2);
    	t.right = s.new TreeNode(3);
    	t.left.left = s.new TreeNode(4);
    	t.left.right = s.new TreeNode(5);
		System.out.println(s.sumOfLeftLeaves(t));
	}
}