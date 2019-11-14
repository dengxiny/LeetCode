package com.LeetCode.code.q572.SubtreeofAnotherTree;
/**
 * @QuestionId	:	572
 * @difficulty	:	Easy
 * @Title	 	:	Subtree of Another Tree
 * @TranslatedTitle:另一个树的子树
 * @url			:	https://leetcode-cn.com/problems/subtree-of-another-tree/
 * @TranslatedContent:给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
	
	示例 1:<br />
	给定的树 s:
	
	
	     3
	    / \
	   4   5
	  / \
	 1   2
	
	
	给定的树 t：
	
	
	   4 
	  / \
	 1   2
	
	
	返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
	
	示例 2:<br />
	给定的树 s：
	
	
	     3
	    / \
	   4   5
	  / \
	 1   2
	    /
	   0
	
	
	给定的树 t：
	
	
	   4
	  / \
	 1   2
	
	
	返回 false。
	
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
	  
	boolean flag = false;
    public boolean isSubtree(TreeNode s, TreeNode t) {
    	if(s!=null) {
    		flag = flag ||isSame(s,t); 
    		if(!flag) {
    			flag = isSubtree(s.left,t)||isSubtree(s.right,t);
    		}
    	}
		return flag;
        
    }
    
    public boolean isSame(TreeNode p, TreeNode q) {
		if(p==null&&q==null) {
			return true;
		}
		if(p==null||q==null) {
			return false;
		}
		return p.val==q.val&&isSame(p.left,q.left)&&isSame(p.right,q.right);
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	TreeNode t = s.new TreeNode(4);
    	t.left = s.new TreeNode(4);
    	//t.right = s.new TreeNode(2);
    	TreeNode t2 = s.new TreeNode(4);
    	//t2.left = s.new TreeNode(1);
    	//t2.right = s.new TreeNode(2);
		System.out.println(s.isSubtree(t, t2));
	}
    
}