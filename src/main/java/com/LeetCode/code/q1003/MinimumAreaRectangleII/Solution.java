package com.LeetCode.code.q1003.MinimumAreaRectangleII;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @QuestionId	:	1003
 * @difficulty	:	Medium
 * @Title	 	:	Minimum Area Rectangle II
 * @TranslatedTitle:最小面积矩形 II
 * @url			:	https://leetcode-cn.com/problems/minimum-area-rectangle-ii/
 * @TranslatedContent:给定在 xy 平面上的一组点，确定由这些点组成的任何矩形的最小面积，其中矩形的边不一定平行于 x 轴和 y 轴。
	
	如果没有任何矩形，就返回 0。
	
	 
	
	示例 1：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/22/1a.png" style="height: 151px; width: 150px;">
	
	输入：[[1,2],[2,1],[1,0],[0,1]]
	输出：2.00000
	解释：最小面积的矩形出现在 [1,2],[2,1],[1,0],[0,1] 处，面积为 2。
	
	示例 2：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/23/2.png" style="height: 94px; width: 150px;">
	
	输入：[[0,1],[2,1],[1,1],[1,0],[2,0]]
	输出：1.00000
	解释：最小面积的矩形出现在 [1,0],[1,1],[2,1],[2,0] 处，面积为 1。
	
	
	示例 3：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/23/3.png" style="height: 94px; width: 150px;">
	
	输入：[[0,3],[1,2],[3,1],[1,3],[2,1]]
	输出：0
	解释：没法从这些点中组成任何矩形。
	
	
	示例 4：
	
	<img alt="" src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/12/21/4c.png" style="height: 155px; width: 160px;">
	
	输入：[[3,1],[1,1],[0,1],[2,1],[3,3],[3,2],[0,2],[2,3]]
	输出：2.00000
	解释：最小面积的矩形出现在 [2,1],[2,3],[3,3],[3,1] 处，面积为 2。
	
	
	 
	
	提示：
	
	
		1 <= points.length <= 50
		0 <= points[i][0] <= 40000
		0 <= points[i][1] <= 40000
		所有的点都是不同的。
		与真实值误差不超过 10^-5 的答案将视为正确结果。
	
	
 */
class Solution {
	/**
	 * 向量法or枚举法
	 * @param points
	 * @return
	 */
    public double minAreaFreeRect(int[][] points) {
    	List<String> list = new ArrayList<>();
    	for (int[] is : points) {
			list.add(is[0]+"_"+is[1]);
		}
    	combine(0, 3, list);
    	//System.out.println(alllist);
    	double m = 0.00;
    	for (List<String> arrList : alllist) {
    		double a1 = Double.valueOf(arrList.get(0).split("_")[0]);//点1
    		double a2 = Double.valueOf(arrList.get(0).split("_")[1]);
    		double a3 = Double.valueOf(arrList.get(1).split("_")[0]);//点2
    		double a4 = Double.valueOf(arrList.get(1).split("_")[1]);
    		double a5 = Double.valueOf(arrList.get(2).split("_")[0]);//点3
    		double a6 = Double.valueOf(arrList.get(2).split("_")[1]);
    		double len1 = (a1-a3)*(a1-a3)+(a2-a4)*(a2-a4);//点1-2
    		double len2 = (a1-a5)*(a1-a5)+(a2-a6)*(a2-a6);//点1-3
    		double len3 = (a3-a5)*(a3-a5)+(a4-a6)*(a4-a6);//点2-3
    		boolean e1 = (len1+len2-len3==0.00);//点2-3 直角斜边
    		boolean e2 = (len2+len3-len1==0.00);//点1-2 直角斜边
    		boolean e3 = (len1+len3-len2==0.00);//点1-3 直角斜边
    		/*BigDecimal len1 = (a1.subtract(a3)).pow(2).add((a2.subtract(a4)).pow(2));//点1-2
    		BigDecimal len2 = (a1.subtract(a5)).pow(2).add((a2.subtract(a6)).pow(2));//点1-3
    		BigDecimal len3 = (a5.subtract(a3)).pow(2).add((a6.subtract(a4)).pow(2));//点2-3
    		boolean e1 = (len1.add(len2).compareTo(len3)==0);//点2-3 直角斜边
    		boolean e2 = (len2.add(len3).compareTo(len1)==0);//点1-2 直角斜边
    		boolean e3 = (len1.add(len3).compareTo(len2)==0);//点1-3 直角斜边*/
			if(e1||e2||e3) {
				System.out.println(arrList.get(0)+ " "+arrList.get(1)+ " "+arrList.get(2)+ " ");
				for (String string : list) {
					if(!string.equals(arrList.get(0))&&!string.equals(arrList.get(1))&&!string.equals(arrList.get(2))) {
						double a7 = Double.valueOf(string.split("_")[0]);//点4
						double a8 = Double.valueOf(string.split("_")[1]);
						double len4 = (a7-a1)*(a7-a1)+(a8-a2)*(a8-a2);//点4-1
			    		double len5 = (a7-a3)*(a7-a3)+(a8-a4)*(a8-a4);//点4-2
			    		double len6 = (a7-a5)*(a7-a5)+(a8-a6)*(a8-a6);//点4-3
			    		boolean f1 = (len4+len5-len6==0.00);//点3-4 直角斜边
			    		boolean f2 = (len4+len6-len5==0.00);//点2-4 直角斜边
			    		boolean f3 = (len5+len6-len4==0.00);//点1-4 直角斜边
			    		System.out.println("---------------");
			    		System.out.println(string);
			    		System.out.println(e1 + "" +e2+""+e3);
			    		System.out.println(f1 + "" +f2+""+f3);
						if(f1&&e2) {
							System.out.println(string);
							double sm = Math.sqrt(len4*len5);
							m = m < sm && m>0.00 ? m : sm;
						}else if(f2&&e3) {
							System.out.println(string);
							double sm = Math.sqrt(len4*len6);
							m = m < sm && m>0.00 ? m : sm;
						}else if(f3&&e1) {
							System.out.println(string);
							double sm = Math.sqrt(len5*len6);
							m = m < sm && m>0.00 ? m : sm;
						}
					}
				}
			}
		}
        return m;
    }
    
    /**
     * 思路：
     * 递归，第一层把循环把n个数中的第i个装入结果的第一个位置
     *       把剩下的n-2个数循环装入第二个位置
     *       把剩下的n-3个数循环装入第三个位置
     *       .....
     *       直到最后一个数，返回
     * 注意：下到下一层的时候注意new新的list不然，原来的list也会被改变
     *       其次：
     *       在递归返回的时候应该把记录的data最后一个去掉，否则前面的结果会
     *       影响循环过程。
     * @param arrayList
     * @param data
     * @param arrayListData
     * @param length
     */
    private static void getData(ArrayList<Integer> arrayList ,StringBuilder data, ArrayList<String> arrayListData,int length){
        for (int i = 0; i < arrayList.size(); i++) {
            data.append(arrayList.get(i));
            ArrayList<Integer> newArrayList = new ArrayList<>(arrayList);
            newArrayList.remove(i);
            getData(newArrayList,data,arrayListData,length);
        }
        if (arrayList.size()==0)
        {
            arrayListData.add(data.toString());
        }
        if (data.length()!=0){
            data.deleteCharAt(data.length()-1);
        }
    }
    
    public static Stack<Integer> stack = new Stack<Integer>();
    
    private static void f(int[] shu, int targ, int has, int cur) {
        if(has == targ) {
            System.out.println(stack);
            return;
        }
         
        for(int i=cur;i<shu.length;i++) {
            if(!stack.contains(shu[i])) {
                stack.add(shu[i]);
                f(shu, targ, has+1, i);
                stack.pop();
            }
        }
         
    }
    
    private static ArrayList<String> tmpArr = new ArrayList<>();
    
    private static ArrayList<ArrayList<String>> alllist = new ArrayList<>();
    /**
     * 组合
     * 按一定的顺序取出元素，就是组合,元素个数[C arr.len 3]
     * @param index 元素位置
     * @param k 选取的元素个数
     * @param arr 数组
     */
    public static void combine(int index,int k,List<String> arr) {
        if(k == 1){
            for (int i = index; i < arr.size(); i++) {
                tmpArr.add(arr.get(i));
                ArrayList<String> copy = new ArrayList<>(tmpArr);
                alllist.add(copy);
                tmpArr.remove(arr.get(i));
            }
        }else if(k > 1){
            for (int i = index; i <= arr.size()- k; i++) {
                tmpArr.add(arr.get(i)); //tmpArr都是临时性存储一下
                combine(i + 1,k - 1, arr); //索引右移，内部循环，自然排除已经选择的元素
                tmpArr.remove(arr.get(i)); //tmpArr因为是临时存储的，上一个组合找出后就该释放空间，存储下一个元素继续拼接组合了
            }
        }else{
            return ;
        }
    }
    
    public static void main(String[] args) {
    	//int[][] points = new int[][] {{0,3},{1,2},{3,1},{1,3},{2,1}};
    	int[][] points = new int[][] {{0,3},{1,2},{3,1},{1,3},{2,1}};
    	//int[][] points = new int[][] {{3,1},{1,1},{0,1},{2,1},{3,3},{3,2},{0,2},{2,3}};
    	
    	
    	System.err.println(new Solution().minAreaFreeRect(points));
    	
    	
    	List<String> list = new ArrayList<>();
    	for (int[] is : points) {
			list.add(is[0]+"_"+is[1]);
		}
    	combine(0, 3, list);
    	//System.out.println(alllist);
    	double m = 0.00;
    	for (List<String> arrList : alllist) {
    		BigDecimal a1 = new BigDecimal(arrList.get(0).split("_")[0]);//点1
    		BigDecimal a2 = new BigDecimal(arrList.get(0).split("_")[1]);
    		BigDecimal a3 = new BigDecimal(arrList.get(1).split("_")[0]);//点2
    		BigDecimal a4 = new BigDecimal(arrList.get(1).split("_")[1]);
    		BigDecimal a5 = new BigDecimal(arrList.get(2).split("_")[0]);//点3
    		BigDecimal a6 = new BigDecimal(arrList.get(2).split("_")[1]);
    		BigDecimal len1 = (a1.subtract(a3)).pow(2).add((a2.subtract(a4)).pow(2));//点1-2
    		BigDecimal len2 = (a1.subtract(a5)).pow(2).add((a2.subtract(a6)).pow(2));//点1-3
    		BigDecimal len3 = (a5.subtract(a3)).pow(2).add((a6.subtract(a4)).pow(2));//点2-3
    		boolean e1 = (len1.add(len2).compareTo(len3)==0);//点2-3 直角斜边
    		boolean e2 = (len2.add(len3).compareTo(len1)==0);//点1-2 直角斜边
    		boolean e3 = (len1.add(len3).compareTo(len2)==0);//点1-3 直角斜边
			if(len1.add(len2).compareTo(len3)==0||len2.add(len3).compareTo(len1)==0||len1.add(len3).compareTo(len2)==0) {
				for (String string : list) {
					if(!string.equals(arrList.get(0))&&!string.equals(arrList.get(1))&&!string.equals(arrList.get(2))) {
						BigDecimal a7 = new BigDecimal(string.split("_")[0]);//点4
						BigDecimal a8 = new BigDecimal(string.split("_")[1]);
						BigDecimal len4 = (a1.subtract(a7)).pow(2).add((a2.subtract(a8)).pow(2));//点1-4
			    		BigDecimal len5 = (a3.subtract(a7)).pow(2).add((a4.subtract(a8)).pow(2));//点2-4
			    		BigDecimal len6 = (a5.subtract(a7)).pow(2).add((a6.subtract(a8)).pow(2));//点3-4
			    		boolean f1 = (len4.add(len5).compareTo(len6)==0);//点3-4 直角斜边
			    		boolean f2 = (len4.add(len6).compareTo(len5)==0);//点2-4 直角斜边
			    		boolean f3 = (len5.add(len6).compareTo(len4)==0);//点1-4 直角斜边
						if(f1&&e2) {
							double sm = sqrt(len4.multiply(len5),3).doubleValue();
							//System.out.print(arrList.get(0)+ " "+arrList.get(1)+ " "+arrList.get(2)+ " "+string+ " ");
							//System.out.println(sm);
							m = m < sm && m>0.00 ? m : sm;
						}else if(f2&&e3) {
							double sm = sqrt(len4.multiply(len6),3).doubleValue();
							//System.out.print(arrList.get(0)+ " "+arrList.get(1)+ " "+arrList.get(2)+ " "+string+ " ");
							//System.out.println(sm);
							m = m < sm && m>0.00 ? m : sm;
						}else if(f3&&e1) {
							double sm = sqrt(len5.multiply(len6),3).doubleValue();
							//System.out.print(arrList.get(0)+ " "+arrList.get(1)+ " "+arrList.get(2)+ " "+string+ " ");
							//System.out.println(sm);
							m = m < sm && m>0.00 ? m : sm;
						}
					}
				}
			}
		}
    	//System.out.println(m);
	}
    
    public static BigDecimal sqrt(BigDecimal value, int scale){
        BigDecimal num2 = BigDecimal.valueOf(2);
        int precision = 100;
        MathContext mc = new MathContext(precision, RoundingMode.HALF_UP);
        BigDecimal deviation = value;
        int cnt = 0;
        while (cnt < precision) {
            deviation = (deviation.add(value.divide(deviation, mc))).divide(num2, mc);
            cnt++;
        }
        deviation = deviation.setScale(scale, BigDecimal.ROUND_HALF_UP);
        return deviation;
    }

    
}