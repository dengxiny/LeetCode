package com.LeetCode.code.q543.DiameterofBinaryTree;


/**
 * @QuestionId	:	543
 * @difficulty	:	Easy
 * @Title	 	:	Diameter of Binary Tree
 * @TranslatedTitle:二叉树的直径
 * @url			:	https://leetcode-cn.com/problems/diameter-of-binary-tree/
 * @TranslatedContent:给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
	
	示例 :<br />
	给定二叉树
	
	
	          1
	         / \
	        2   3
	       / \     
	      4   5    
	
	
	返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
	
	注意：两结点之间的路径长度是以它们之间边的数目表示。
	
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
	int sum = 0; 
    public int diameterOfBinaryTree(TreeNode root) {
    	if(root==null) {
    		return 0;
    	}else {
    		depth(root);
    		return sum;
    	}
    }
    
    public int depth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int left = depth(root.left);
		int right = depth(root.right);
		if(left+right>sum) {
			sum = left+right;
		}
		return Math.max(left, right)+1;
	}

	public static void main(String[] args) {
    	Solution s = new Solution();
    	TreeNode t =  s.new TreeNode(5);
    	t.left = s.new TreeNode(2);
    	t.right = s.new TreeNode(13);
    	System.out.println(s.diameterOfBinaryTree(t));
	}
}