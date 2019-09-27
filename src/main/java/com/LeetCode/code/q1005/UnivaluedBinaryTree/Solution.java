package com.LeetCode.code.q1005.UnivaluedBinaryTree;
/**
 * @QuestionId	:	1005
 * @difficulty	:	Easy
 * @Title	 	:	Univalued Binary Tree
 * @TranslatedTitle:单值二叉树
 * @url			:	https://leetcode-cn.com/problems/univalued-binary-tree/
 * @TranslatedContent:如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
	
	只有给定的树是单值二叉树时，才返回 true；否则返回 false。
	
	 
	
	示例 1：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/29/screen-shot-2018-12-25-at-50104-pm.png" style="height: 159px; width: 200px;">
	
	输入：[1,1,1,1,1,null,1]
	输出：true
	
	
	示例 2：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/29/screen-shot-2018-12-25-at-50050-pm.png" style="height: 158px; width: 200px;">
	
	输入：[2,2,2,5,2]
	输出：false
	
	
	 
	
	提示：
	
	
		给定树的节点数范围是 [1, 100]。
		每个节点的值都是整数，范围为 [0, 99] 。
	
	
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
    public boolean isUnivalTree(TreeNode root) {
    	if(root == null) {
    		return true;
    	}
    	if(root.left!=null&&root.left.val!=root.val) {
    		return false ;
    	}
    	if(root.right!=null&&root.right.val!=root.val){
    		return false;
    	}
        return isUnivalTree(root.right)&&isUnivalTree(root.left);
    }
}