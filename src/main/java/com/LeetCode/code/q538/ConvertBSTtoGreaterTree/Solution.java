package com.LeetCode.code.q538.ConvertBSTtoGreaterTree;

import com.alibaba.fastjson.JSONObject;

/**
 * @QuestionId	:	538
 * @difficulty	:	Easy
 * @Title	 	:	Convert BST to Greater Tree
 * @TranslatedTitle:把二叉搜索树转换为累加树
 * @url			:	https://leetcode-cn.com/problems/convert-bst-to-greater-tree/
 * @TranslatedContent:给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
	
	例如：
	
	
	输入: 二叉搜索树:
	              5
	            /   \
	           2     13
	
	输出: 转换为累加树:
	             18
	            /   \
	          20     13
	
	
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
	int num = 0 ;  
    public TreeNode convertBST(TreeNode root) {
    	if(root==null) {
    		return null;
    	}
    	convertBST(root.right);
    	num = num + root.val;
    	root.val = num ;
    	convertBST(root.left);
		return root;
        
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	TreeNode t =  s.new TreeNode(5);
    	t.left = s.new TreeNode(2);
    	t.right = s.new TreeNode(13);
    	TreeNode r = s.convertBST(t);
		//System.out.println(JSONObject.toJSONString());
	}
}