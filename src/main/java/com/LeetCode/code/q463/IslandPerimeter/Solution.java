package com.LeetCode.code.q463.IslandPerimeter;
/**
 * @QuestionId	:	463
 * @difficulty	:	Easy
 * @Title	 	:	Island Perimeter
 * @TranslatedTitle:岛屿的周长
 * @url			:	https://leetcode-cn.com/problems/island-perimeter/
 * @TranslatedContent:给定一个包含 0 和 1 的二维网格地图，其中 1 表示陆地 0 表示水域。
	
	网格中的格子水平和垂直方向相连（对角线方向不相连）。整个网格被水完全包围，但其中恰好有一个岛屿（或者说，一个或多个表示陆地的格子相连组成的岛屿）。
	
	岛屿中没有&ldquo;湖&rdquo;（&ldquo;湖&rdquo; 指水域在岛屿内部且不和岛屿周围的水相连）。格子是边长为 1 的正方形。网格为长方形，且宽度和高度均不超过 100 。计算这个岛屿的周长。
	
	 
	
	示例 :
	
	输入:
	[[0,1,0,0],
	 [1,1,1,0],
	 [0,1,0,0],
	 [1,1,0,0]]
	
	输出: 16
	
	解释: 它的周长是下面图片中的 16 个黄色的边：
	
	<img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/island.png">
	
	
 */
class Solution {
	/**
	 * 每次判断是岛屿就去查之前并且相邻因为重合一边所以-2
	 * @param grid
	 * @return
	 */
    public int islandPerimeter(int[][] grid) {
    	int sum=0;
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j]==1) {
					sum+=4;
					if(i-1>=0&&grid[i-1][j]==1) {
						sum-=2;
					}
					if(j-1>=0&&grid[i][j-1]==1) {
						sum-=2;
					}
				}
			}
		}
        return sum;
    }
    
    public static void main(String[] args) {
		System.out.println(new Solution().islandPerimeter(new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
	}
}