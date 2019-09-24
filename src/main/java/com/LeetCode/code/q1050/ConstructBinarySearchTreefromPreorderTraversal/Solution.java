package com.LeetCode.code.q1050.ConstructBinarySearchTreefromPreorderTraversal;
/**
 * @QuestionId	:	1050
 * @difficulty	:	Medium
 * @Title	 	:	Construct Binary Search Tree from Preorder Traversal
 * @TranslatedTitle:先序遍历构造二叉树
 * @url			:	https://leetcode-cn.com/problems/construct-binary-search-tree-from-preorder-traversal/
 * @TranslatedContent:返回与给定先序遍历 preorder 相匹配的二叉搜索树（binary search tree）的根结点。
	
	(回想一下，二叉搜索树是二叉树的一种，其每个节点都满足以下规则，对于 node.left 的任何后代，值总 < node.val，而 node.right 的任何后代，值总 > node.val。此外，先序遍历首先显示节点的值，然后遍历 node.left，接着遍历 node.right。）
	
	 
	
	示例：
	
	输入：[8,5,1,7,10,12]
	输出：[8,5,10,1,7,null,12]
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/03/08/1266.png" style="height: 200px; width: 306px;">
	
	
	 
	
	提示：
	
	
		1 <= preorder.length <= 100
		先序 preorder 中的值是不同的。
	
	
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
    public TreeNode bstFromPreorder(int[] preorder) {
        
    }
}