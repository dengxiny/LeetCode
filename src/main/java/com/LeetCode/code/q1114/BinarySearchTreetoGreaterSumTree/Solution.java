package com.LeetCode.code.q1114.BinarySearchTreetoGreaterSumTree;
/**
 * @QuestionId	:	1114
 * @difficulty	:	Medium
 * @Title	 	:	Binary Search Tree to Greater Sum Tree
 * @TranslatedTitle:从二叉搜索树到更大和树
 * @url			:	https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree/
 * @TranslatedContent:给出二叉搜索树的根节点，该二叉树的节点值各不相同，修改二叉树，使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。
	
	提醒一下，二叉搜索树满足下列约束条件：
	
	
		节点的左子树仅包含键小于节点键的节点。
		节点的右子树仅包含键大于节点键的节点。
		左右子树也必须是二叉搜索树。
	
	
	 
	
	示例：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/05/03/tree.png" style="height: 191px; width: 280px;">
	
	输入：[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
	输出：[30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
	
	
	 
	
	提示：
	
	
		树中的节点数介于 1 和 100 之间。
		每个节点的值介于 0 和 100 之间。
		给定的树为二叉搜索树。
	
	
	 
	
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
    public TreeNode bstToGst(TreeNode root) {
        
    }
}