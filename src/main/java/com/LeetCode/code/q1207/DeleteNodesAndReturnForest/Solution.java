package com.LeetCode.code.q1207.DeleteNodesAndReturnForest;
/**
 * @QuestionId	:	1207
 * @difficulty	:	Medium
 * @Title	 	:	Delete Nodes And Return Forest
 * @TranslatedTitle:删点成林
 * @url			:	https://leetcode-cn.com/problems/delete-nodes-and-return-forest/
 * @TranslatedContent:给出二叉树的根节点 root，树上每个节点都有一个不同的值。
	
	如果节点值在 to_delete 中出现，我们就把该节点从树上删去，最后得到一个森林（一些不相交的树构成的集合）。
	
	返回森林中的每棵树。你可以按任意顺序组织答案。
	
	 
	
	示例：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/07/05/screen-shot-2019-07-01-at-53836-pm.png" style="height: 150px; width: 237px;">
	
	输入：root = [1,2,3,4,5,6,7], to_delete = [3,5]
	输出：[[1,2,null,4],[6],[7]]
	
	
	 
	
	提示：
	
	
		树中的节点数最大为 1000。
		每个节点都有一个介于 1 到 1000 之间的值，且各不相同。
		to_delete.length <= 1000
		to_delete 包含一些从 1 到 1000、各不相同的值。
	
	
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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        
    }
}