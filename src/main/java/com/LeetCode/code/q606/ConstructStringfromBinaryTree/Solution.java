package com.LeetCode.code.q606.ConstructStringfromBinaryTree;


/**
 * @QuestionId	:	606
 * @difficulty	:	Easy
 * @Title	 	:	Construct String from Binary Tree
 * @TranslatedTitle:根据二叉树创建字符串
 * @url			:	https://leetcode-cn.com/problems/construct-string-from-binary-tree/
 * @TranslatedContent:你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
	
	空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
	
	示例 1:
	
	
	输入: 二叉树: [1,2,3,4]
	       1
	     /   \
	    2     3
	   /    
	  4     
	
	输出: "1(2(4))(3)"
	
	解释: 原本将是&ldquo;1(2(4)())(3())&rdquo;，
	在你省略所有不必要的空括号对之后，
	它将是&ldquo;1(2(4))(3)&rdquo;。
	
	
	示例 2:
	
	
	输入: 二叉树: [1,2,3,null,4]
	       1
	     /   \
	    2     3
	     \  
	      4 
	
	输出: "1(2()(4))(3)"
	
	解释: 和第一个示例相似，
	除了我们不能省略第一个对括号来中断输入和输出之间的一对一映射关系。
	
	
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
	StringBuilder s =null; 
	TreeNode pre = null;
    public String tree2str(TreeNode t) {
    	s = new StringBuilder();
    	s.append("");
    	order(t);
    	//去掉最外层括号
        return s.length()>1?s.substring(1,s.length()-1).toString():s.toString();
    }
    
    
    public void order(TreeNode t) {
    	if(t == null) {
    		return ;
    	}
    	//如果左节点为空右节点不为空
    	if(pre != null&&pre.left == null&&pre.right == t) {
			s.append("()");
		}
		s.append("(");
		s.append(t.val);
        pre = t;
        order(t.left);
        order(t.right);
        s.append(")");
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
		TreeNode t = s.new TreeNode(1);
		t.right = s.new TreeNode(3);
		t.left = s.new TreeNode(2);
		t.left.left = s.new TreeNode(4);
		System.out.println(s.tree2str(t));
	}
}