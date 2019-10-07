package com.LeetCode.code.q1035.CousinsinBinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @QuestionId	:	1035
 * @difficulty	:	Easy
 * @Title	 	:	Cousins in Binary Tree
 * @TranslatedTitle:二叉树的堂兄弟节点
 * @url			:	https://leetcode-cn.com/problems/cousins-in-binary-tree/
 * @TranslatedContent:在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
	
	如果二叉树的两个节点深度相同，但父节点不同，则它们是一对堂兄弟节点。
	
	我们给出了具有唯一值的二叉树的根节点 root，以及树中两个不同节点的值 x 和 y。
	
	只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true。否则，返回 false。
	
	 
	
	示例 1：
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/16/q1248-01.png" style="height: 160px; width: 180px;">
	
	输入：root = [1,2,3,4], x = 4, y = 3
	输出：false
	
	
	示例 2：
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/16/q1248-02.png" style="height: 160px; width: 201px;">
	
	输入：root = [1,2,3,null,4,null,5], x = 5, y = 4
	输出：true
	
	
	示例 3：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/16/q1248-03.png" style="height: 160px; width: 156px;">
	
	输入：root = [1,2,3,null,4], x = 2, y = 3
	输出：false
	
	 
	
	提示：
	
	
		二叉树的节点数介于 2 到 100 之间。
		每个节点的值都是唯一的、范围为 1 到 100 的整数。
	
	
	 
	
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
 
	   
    public boolean isCousins(TreeNode root, int x, int y) {
    	Map<String,Integer> map = new HashMap();
    	put(root, map, x, y,0);
    	System.out.println(map.toString());
    	if(map.get(String.valueOf(x))==map.get(String.valueOf(y))&&map.get("p1")!=map.get("p2")) {
    		return true;
    	}
    	return false;
    }
    
    public void put(TreeNode root,Map<String,Integer> map, int x, int y,int size) {
    	if(root==null) {
    		return;
    	}
    	if((root.left!=null&&root.left.val==x)||(root.right!=null&&root.right.val==x)) {
    		System.out.println(String.valueOf(x));
    		map.put(String.valueOf(x), size+1);
    		map.put("p1", root.val);
    	}
    	if((root.left!=null&&root.left.val==y)||(root.right!=null&&root.right.val==y)) {
    		map.put(String.valueOf(y), size+1);
    		map.put("p2", root.val);
    	}
    	put(root.left, map, x, y,size+1);
    	put(root.right, map, x, y,size+1);
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	TreeNode root = s.new TreeNode(1);
    	root.left = s.new TreeNode(2);
    	root.left.right = s.new TreeNode(4);
    	root.right = s.new TreeNode(3);
    	root.right.right = s.new TreeNode(5);
    	//root.right.right = s.new TreeNode(7);
		System.out.println(s.isCousins(root,5,4));
	}
}