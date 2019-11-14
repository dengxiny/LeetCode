package com.LeetCode.code.q653.TwoSumIV

import java.util.HashMap;
import java.util.Map;

-InputisaBST;
/**
 * @QuestionId	:	653
 * @difficulty	:	Easy
 * @Title	 	:	Two Sum IV - Input is a BST
 * @TranslatedTitle:两数之和 IV - 输入 BST
 * @url			:	https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/
 * @TranslatedContent:给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
	
	案例 1:
	
	
	输入: 
	    5
	   / \
	  3   6
	 / \   \
	2   4   7
	
	Target = 9
	
	输出: True
	
	
	 
	
	案例 2:
	
	
	输入: 
	    5
	   / \
	  3   6
	 / \   \
	2   4   7
	
	Target = 28
	
	输出: False
	
	
	 
	
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
    public boolean findTarget(TreeNode root, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        return order(root,k,map);
    }
	private boolean order(TreeNode root, int k, Map<Integer, Integer> map) {
		if(root==null) {
			return false;
		}
		if(map.containsKey(k-root.val)) {
			return true;
		}else {
			map.put(root.val, root.val);
		}
		return order(root.left, k, map)||order(root.right, k, map);
	}
}