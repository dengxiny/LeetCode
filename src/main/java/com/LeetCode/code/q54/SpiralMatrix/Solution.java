package com.LeetCode.code.q54.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @QuestionId	:	54
 * @difficulty	:	Medium
 * @Title	 	:	Spiral Matrix
 * @TranslatedTitle:螺旋矩阵
 * @url			:	https://leetcode-cn.com/problems/spiral-matrix/
 * @TranslatedContent:给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
	
	示例 1:
	
	输入:
	[
	 [ 1, 2, 3 ],
	 [ 4, 5, 6 ],
	 [ 7, 8, 9 ]
	]
	输出: [1,2,3,6,9,8,7,4,5]
	
	
	示例 2:
	
	输入:
	[
	  [1, 2, 3, 4],
	  [5, 6, 7, 8],
	  [9,10,11,12]
	]
	输出: [1,2,3,4,8,12,11,10,9,5,6,7]
	
	
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> list = new ArrayList<Integer>();
    	if(null == matrix || matrix.length == 0 ||matrix[0].length==0) {
    		return list;
    	}
    	int rows = matrix.length, columns = matrix[0].length;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        while(left<=right&&top<=bottom){
        	for (int i = left; i <= right; i++) {
        		list.add(matrix[top][i]);
			}
        	for (int i = top+1; i <= bottom; i++) {
        		list.add(matrix[i][right]);
			}
        	if(left<right&&top<bottom) {
        		for (int i = right-1; i >= left; i--) {
            		list.add(matrix[bottom][i]);
    			}
            	for (int i = bottom-1; i >= top+1; i--) {
            		list.add(matrix[i][left]);
    			}
        	}
        	left++;
        	top++;
        	right--;
        	bottom--;
        }
        return list;
    }
    
    public static void main(String[] args) {
		
	}
}