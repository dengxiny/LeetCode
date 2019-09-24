package com.LeetCode.code.q1008.BinaryTreeCameras;
/**
 * @QuestionId	:	1008
 * @difficulty	:	Hard
 * @Title	 	:	Binary Tree Cameras
 * @TranslatedTitle:监控二叉树
 * @url			:	https://leetcode-cn.com/problems/binary-tree-cameras/
 * @TranslatedContent:给定一个二叉树，我们在树的节点上安装摄像头。
	
	节点上的每个摄影头都可以监视其父对象、自身及其直接子对象。
	
	计算监控树的所有节点所需的最小摄像头数量。
	
	 
	
	示例 1：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/29/bst_cameras_01.png" style="height: 163px; width: 138px;">
	
	输入：[0,0,null,0,0]
	输出：1
	解释：如图所示，一台摄像头足以监控所有节点。
	
	
	示例 2：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/29/bst_cameras_02.png" style="height: 312px; width: 139px;">
	
	输入：[0,0,null,0,null,0,null,null,0]
	输出：2
	解释：需要至少两个摄像头来监视树的所有节点。 上图显示了摄像头放置的有效位置之一。
	
	
	
	提示：
	
	
		给定树的节点数的范围是 [1, 1000]。
		每个节点的值都是 0。
	
	
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
    public int minCameraCover(TreeNode root) {
        
    }
}