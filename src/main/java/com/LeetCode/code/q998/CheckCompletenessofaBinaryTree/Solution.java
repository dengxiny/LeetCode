package com.LeetCode.code.q998.CheckCompletenessofaBinaryTree;
/**
 * @QuestionId	:	998
 * @difficulty	:	Medium
 * @Title	 	:	Check Completeness of a Binary Tree
 * @TranslatedTitle:二叉树的完全性检验
 * @url			:	https://leetcode-cn.com/problems/check-completeness-of-a-binary-tree/
 * @TranslatedContent:给定一个二叉树，确定它是否是一个完全二叉树。
	
	<a href="https://baike.baidu.com/item/完全二叉树/7773232?fr=aladdin" target="_blank">百度百科中对完全二叉树的定义如下：
	
	若设二叉树的深度为 h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。（注：第 h 层可能包含 1~ 2h 个节点。）
	
	 
	
	示例 1：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/complete-binary-tree-1.png" style="height: 145px; width: 180px;">
	
	输入：[1,2,3,4,5,6]
	输出：true
	解释：最后一层前的每一层都是满的（即，结点值为 {1} 和 {2,3} 的两层），且最后一层中的所有结点（{4,5,6}）都尽可能地向左。
	
	
	示例 2：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/15/complete-binary-tree-2.png">
	
	输入：[1,2,3,4,5,null,7]
	输出：false
	解释：值为 7 的结点没有尽可能靠向左侧。
	
	
	 
	
	提示：
	
	
		树中将会有 1 到 100 个结点。
	
	
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
    public boolean isCompleteTree(TreeNode root) {
        
    }
}