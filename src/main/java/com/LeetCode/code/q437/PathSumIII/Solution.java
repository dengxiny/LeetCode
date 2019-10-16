package com.LeetCode.code.q437.PathSumIII;
/**
 * @QuestionId	:	437
 * @difficulty	:	Easy
 * @Title	 	:	Path Sum III
 * @TranslatedTitle:路径总和 III
 * @url			:	https://leetcode-cn.com/problems/path-sum-iii/
 * @TranslatedContent:给定一个二叉树，它的每个结点都存放着一个整数值。
	
	找出路径和等于给定数值的路径总数。
	
	路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
	
	二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
	
	示例：
	
	root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
	
	      10
	     /  \
	    5   -3
	   / \    \
	  3   2   11
	 / \   \
	3  -2   1
	
	返回 3。和等于 8 的路径有:
	
	1.  5 -> 3
	2.  5 -> 2 -> 1
	3.  -3 -> 11
	
	
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
	public int num; 
    public int pathSum(TreeNode root, int sum) {
    	if(root==null) {
    		return num;
    	}
    	find(root,sum);
    	pathSum(root.left,sum);
    	pathSum(root.right,sum);
        return num;
    }
    
    public void find(TreeNode root,int sum) {
    	if(root == null) {
    		return ;
    	}
    	sum-=root.val;
    	if(sum==0) {
    		num++;
    		return;
    	}
    	find(root.left,sum);
    	find(root.right,sum);
    }
    
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	TreeNode t = s.new TreeNode(10);
    	t.left = s.new TreeNode(5);
    	t.right = s.new TreeNode(-3);
    	t.left.left = s.new TreeNode(3);
    	t.left.right = s.new TreeNode(2);
    	t.left.left.left = s.new TreeNode(3);
    	t.left.left.right = s.new TreeNode(-2);
    	t.left.right.right = s.new TreeNode(1);
    	t.right.right = s.new TreeNode(11);
    	int sum=8;
		System.out.println(s.pathSum(t,sum));
	}
}