package com.LeetCode.code.q563.BinaryTreeTilt;


/**
 * @QuestionId	:	563
 * @difficulty	:	Easy
 * @Title	 	:	Binary Tree Tilt
 * @TranslatedTitle:二叉树的坡度
 * @url			:	https://leetcode-cn.com/problems/binary-tree-tilt/
 * @TranslatedContent:给定一个二叉树，计算整个树的坡度。
	
	一个树的节点的坡度定义即为，该节点左子树的结点之和和右子树结点之和的差的绝对值。空结点的的坡度是0。
	
	整个树的坡度就是其所有节点的坡度之和。
	
	示例:
	
	
	输入: 
	         1
	       /   \
	      2     3
	输出: 1
	解释: 
	结点的坡度 2 : 0
	结点的坡度 3 : 0
	结点的坡度 1 : |2-3| = 1
	树的坡度 : 0 + 0 + 1 = 1
	
	
	注意:
	
	
		任何子树的结点的和不会超过32位整数的范围。
		坡度的值不会超过32位整数的范围。
	
	
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
	  
	 
	int sum = 0;  
    public int findTilt(TreeNode root) {
    	getSum(root);
        return sum;
    }


	public int getSum(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int left = getSum(root.left);
		int right = getSum(root.right);
		sum +=Math.abs(left-right);
		return root.val+right+left;
	}
	
	public static void main(String[] args) {
	   	Solution s = new Solution();
    	TreeNode t =  s.new TreeNode(3);
    	t.left = s.new TreeNode(2);
    	t.right = s.new TreeNode(4);
    	t.left.left = s.new TreeNode(3);
    	t.left.right = s.new TreeNode(1);
    	t.right.left = s.new TreeNode(5);
    	t.right.right = s.new TreeNode(7);
    	//|3-1|+|5-7|+|2+3+1-4-5-7|=2+2+10=14
    	System.out.println(s.findTilt(t));
	}
}