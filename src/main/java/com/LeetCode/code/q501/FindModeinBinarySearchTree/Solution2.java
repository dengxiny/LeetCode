package com.LeetCode.code.q501.FindModeinBinarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.JSON;

/**
 * @QuestionId	:	501
 * @difficulty	:	Easy
 * @Title	 	:	Find Mode in Binary Search Tree
 * @TranslatedTitle:二叉搜索树中的众数
 * @url			:	https://leetcode-cn.com/problems/find-mode-in-binary-search-tree/
 * @TranslatedContent:给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
	
	假定 BST 有如下定义：
	
	
		结点左子树中所含结点的值小于等于当前结点的值
		结点右子树中所含结点的值大于等于当前结点的值
		左子树和右子树都是二叉搜索树
	
	
	例如：
	给定 BST [1,null,2,2],
	
	   1
	    \
	     2
	    /
	   2
	
	
	返回[2].
	
	提示：如果众数超过1个，不需考虑输出顺序
	
	进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
	
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
class Solution2 {
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
/*	    public int[] findMode(TreeNode root) {
	    	if(root==null) {
	    		return null;
	    	}
	    	int cur=1,max=0;
	    	TreeNode pre = null;
	    	List<Integer> list = new ArrayList<Integer>();
	    	order(root,pre,cur, max, list);
	    	int[] res = new int[list.size()];
	    	for (int i = 0; i < list.size(); i++) {
				res[i]=list.get(i);
			}
	        return res;
	    }
	    
	    public void order(TreeNode root,TreeNode pre,int cur,int max,List<Integer> list) {
	    	if(root==null) {
	    		return ;
	    	}
	    	order(root.left,pre,  cur, max, list);
	    	if(pre!=null) {
	    		cur = (root.val==pre.val?cur+1:1);
	    	}
	    	if(cur==max) {
	    		list.add(root.val);
	    	}else if(cur > max) {
	    		max = cur;
	    		list.clear();
	    		list.add(root.val);
	        }
	        pre = root;
	        order(root.right,pre,cur,max,list);
	    }*/
	  TreeNode pre = null;
    public int[] findMode(TreeNode root) {
    	if(root==null) {
    		return null;
    	}
    	int cur=1,max=0;
    	List<Integer> list = new ArrayList<Integer>();
    	order(root, cur, max, list);
    	int[] res = new int[list.size()];
    	for (int i = 0; i < list.size(); i++) {
			res[i]=list.get(i);
		}
    	System.out.println(JSON.toJSONString(pre));
        return res;
    }
    
    public void order(TreeNode root,int cur,int max,List<Integer> list) {
    	if(root==null) {
    		return ;
    	}
    	order(root.left,  cur, max, list);
    	if(pre!=null) {
    		cur = (root.val==pre.val?cur+1:1);
    	}
    	if(cur==max) {
    		list.add(root.val);
    	}else if(cur > max) {
    		max = cur;
    		list.clear();
    		list.add(root.val);
        }
        pre = root;
        order(root.right,cur,max,list);
    }
    
/*	  List<Integer> list = new ArrayList<>();
	    TreeNode pre;
	    int max = 0;
	    int cur = 1;
	    public int[] findMode(TreeNode root) {
	        if(root==null) {
	            return new int[] {};
	        }
	        inorder(root);
	        int[] a = new int[list.size()];
	        for(int i=0;i<list.size();i++) {
	            a[i]=list.get(i);
	        }
	        return a;
	    }
	    private void inorder(TreeNode root) {
	        if(root==null) {
	            return ;
	        }
	        inorder(root.left);
	        if(pre!=null) {
	            if(pre.val==root.val) {
	                cur++;
	            }
	            else {
	                cur=1;
	            }
	        }
	        if(cur==max) {
	            list.add(root.val);
	        }
	        if(cur>max) {
	            list.clear();
	            list.add(root.val);
	            max=cur;
	        }
	        pre=root;
	        inorder(root.right);
	    }*/

    public static void main(String[] args) {
		Solution2 s = new Solution2();
		TreeNode t = s.new TreeNode(1);
		t.right = s.new TreeNode(2);
		t.right.left = s.new TreeNode(2);
		int[] a = s.findMode(t);
		for (int i : a) {
			System.out.println(i);
		}
	}
}