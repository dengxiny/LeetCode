package com.LeetCode.code.q1041.AvailableCapturesforRook;
/**
 * @QuestionId	:	1041
 * @difficulty	:	Easy
 * @Title	 	:	Available Captures for Rook
 * @TranslatedTitle:车的可用捕获量
 * @url			:	https://leetcode-cn.com/problems/available-captures-for-rook/
 * @TranslatedContent:在一个 8 x 8 的棋盘上，有一个白色车（rook）。也可能有空方块，白色的象（bishop）和黑色的卒（pawn）。它们分别以字符 &ldquo;R&rdquo;，&ldquo;.&rdquo;，&ldquo;B&rdquo; 和 &ldquo;p&rdquo; 给出。大写字符表示白棋，小写字符表示黑棋。
	
	车按国际象棋中的规则移动：它选择四个基本方向中的一个（北，东，西和南），然后朝那个方向移动，直到它选择停止、到达棋盘的边缘或移动到同一方格来捕获该方格上颜色相反的卒。另外，车不能与其他友方（白色）象进入同一个方格。
	
	返回车能够在一次移动中捕获到的卒的数量。
	 
	
	示例 1：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/1253_example_1_improved.PNG" style="height: 305px; width: 300px;">
	
	输入：[[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
	输出：3
	解释：
	在本例中，车能够捕获所有的卒。
	
	
	示例 2：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/1253_example_2_improved.PNG" style="height: 306px; width: 300px;">
	
	输入：[[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
	输出：0
	解释：
	象阻止了车捕获任何卒。
	
	
	示例 3：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2019/02/23/1253_example_3_improved.PNG" style="height: 305px; width: 300px;">
	
	输入：[[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]
	输出：3
	解释： 
	车可以捕获位置 b5，d6 和 f5 的卒。
	
	
	 
	
	提示：
	
	
		board.length == board[i].length == 8
		board[i][j] 可以是 &#39;R&#39;，&#39;.&#39;，&#39;B&#39; 或 &#39;p&#39;
		只有一个格子上存在 board[i][j] == &#39;R&#39;
	
	
 */
class Solution {
    public int numRookCaptures(char[][] board) {
        
    }
}