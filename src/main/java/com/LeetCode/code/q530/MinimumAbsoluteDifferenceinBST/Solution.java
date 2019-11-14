package com.LeetCode.code.q530.MinimumAbsoluteDifferenceinBST;


/**
 * @QuestionId	:	530
 * @difficulty	:	Easy
 * @Title	 	:	Minimum Absolute Difference in BST
 * @TranslatedTitle:二叉搜索树的最小绝对差
 * @url			:	https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 * @TranslatedContent:给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。
	
	示例 :
	
	
	输入:
	
	   1
	    \
	     3
	    /
	   2
	
	输出:
	1
	
	解释:
	最小绝对差为1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
	
	
	注意: 树中至少有2个节点。
	
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
	int res = Integer.MAX_VALUE;  
	TreeNode pre;  
	/**
	 * 由于是二叉树满足左节点《root《右节点 直接用中序遍历求
	 * @param root
	 * @return
	 */
    public int getMinimumDifference(TreeNode root) {
    	order(root);
    	return res;
    }
    
    public void order(TreeNode root) {
    	if(root==null) {
    		return ;
    	}
    	order(root.left);
    	if(pre!=null) {
    		res = Math.min(res,Math.abs(pre.val-root.val));
    	}
    	pre = root;
    	order(root.right);
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
		TreeNode t = s.new TreeNode(1);
		t.right = s.new TreeNode(4);
		t.right.right = s.new TreeNode(2);
		System.out.println(s.getMinimumDifference(t));
		
	}
}