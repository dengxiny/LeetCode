package com.LeetCode.code.q101.SymmetricTree;
/**
 * @QuestionId	:	101
 * @difficulty	:	Easy
 * @Title	 	:	Symmetric Tree
 * @TranslatedTitle:对称二叉树
 * @url			:	https://leetcode-cn.com/problems/symmetric-tree/
 * @TranslatedContent:给定一个二叉树，检查它是否是镜像对称的。
	
	例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
	
	    1
	   / \
	  2   2
	 / \ / \
	3  4 4  3
	
	
	但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
	
	    1
	   / \
	  2   2
	   \   \
	   3    3
	
	
	说明:
	
	如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
	
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
    public boolean isSymmetric(TreeNode root) {
    	return isMirror(root,root);
    }
    
    public boolean isMirror(TreeNode p, TreeNode q) {
		if(p==null&&q==null) {
			return true;
		}
		if(p==null||q==null) {
			return false;
		}
		return p.val==q.val&&isMirror(p.left,q.right)&&isMirror(p.right,q.left);
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		//[1,2,2,null,3,null,3]
		TreeNode t = s.new TreeNode(1);
		t.left = s.new TreeNode(2);
		t.right = s.new TreeNode(2);
		t.left.right = s.new TreeNode(3);
		t.right.right = s.new TreeNode(3);
		System.out.println(s.isSymmetric(t));
	}
}