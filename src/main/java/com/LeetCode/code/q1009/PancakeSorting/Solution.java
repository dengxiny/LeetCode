package com.LeetCode.code.q1009.PancakeSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @QuestionId	:	1009
 * @difficulty	:	Medium
 * @Title	 	:	Pancake Sorting
 * @TranslatedTitle:煎饼排序
 * @url			:	https://leetcode-cn.com/problems/pancake-sorting/
 * @TranslatedContent:给定数组 A，我们可以对其进行煎饼翻转：我们选择一些正整数 k <= A.length，然后反转 A 的前 k 个元素的顺序。我们要执行零次或多次煎饼翻转（按顺序一次接一次地进行）以完成对数组 A 的排序。
	
	返回能使 A 排序的煎饼翻转操作所对应的 k 值序列。任何将数组排序且翻转次数在 10 * A.length 范围内的有效答案都将被判断为正确。
	
	 
	
	示例 1：
	
	输入：[3,2,4,1]
	输出：[4,2,4,3]
	解释：
	我们执行 4 次煎饼翻转，k 值分别为 4，2，4，和 3。
	初始状态 A = [3, 2, 4, 1]
	第一次翻转后 (k=4): A = [1, 4, 2, 3]
	第二次翻转后 (k=2): A = [4, 1, 2, 3]
	第三次翻转后 (k=4): A = [3, 2, 1, 4]
	第四次翻转后 (k=3): A = [1, 2, 3, 4]，此时已完成排序。 
	
	
	示例 2：
	
	输入：[1,2,3]
	输出：[]
	解释：
	输入已经排序，因此不需要翻转任何内容。
	请注意，其他可能的答案，如[3，3]，也将被接受。
	
	
	 
	
	提示：
	
	
		1 <= A.length <= 100
		A[i] 是 [1, 2, ..., A.length] 的排列
	
	
 */
class Solution {
	public List<Integer> pancakeSort2(int[] A) {
        List<Integer> ans = new ArrayList();
        int N = A.length;

        Integer[] B = new Integer[N];
        for (int i = 0; i < N; ++i)
            B[i] = i+1;
        Arrays.sort(B, (i, j) -> A[j-1] - A[i-1]);

        for (int i: B) {
            for (int f: ans)
                if (i <= f)
                    i = f+1 - i;
            ans.add(i);
            ans.add(N--);
        }

        return ans;
    }
	
/*    public List<Integer> pancakeSort(int[] a) {
        int len = a.length;
        if (len <= 1) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = len; i >= 1; i--) {

            int pos = findMaxPosition(i, a);
            if (pos == i) {
                continue;
            }

            list.add(pos);
            reverse(a, pos);
            list.add(i);
            reverse(a, i);
        }
        return list;
    }

    private void reverse(int[] a, int num) {
        int i = 0, j = num - 1;
        int temp;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    private int findMaxPosition(int max, int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (a[i] == max) {
                return i + 1;
            }
        }
        return -1;
    }*/
    
    public List<Integer> pancakeSort(int[] A) {
        int times=0;
        List<Integer>list=new ArrayList<>();
        int[]B=Arrays.copyOf(A,A.length);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++)
        {
            times = findMax(A,B,i);
            if(times!=-1){
                if(times!=0){
                 reverse(A,times);
             list.add(times+1);
                }
                //如果当前最大值位置等于0，就可以直接全部翻转
                
                reverse(A,A.length-i-1);
                list.add(A.length-i);
                
        }
        }
        return list;
        
    }
    public int findMax(int[]A,int[]B,int curr)
    {
        int num=B[B.length-curr-1];
        int index=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==num)
            {  
            index=i;
             break;
            }
            
        }
        if(B.length-curr-1==index)
            return -1;
 
        return index;
    }
    

	public List<Integer> pancakeSort3(int[] A) {
        List<Integer> ans = new ArrayList<Integer>();
        int[] B = Arrays.copyOf(A,A.length);
        Arrays.sort(B);
        for (int i = B.length; i > 1 ; i--) {
        	int index = max(A,B[i-1])+1;
        	System.out.println(i+"-"+index);
			if(i>index) {
				if(i>2) {
					ans.add(index);
					reverse(A,index-1);
					ans.add(i);
					reverse(A,i-1);
				}else {
					ans.add(2);
				}
			}
			for (int j : A) {
				System.out.print(j+",");
			}
			System.out.println();
		}
        return ans;
    }
	
	public int max(int[] A,int max) {
		int i=0,j=A.length-1;
		while(i<=j) {
			if(A[i]==max) {
				return i;
			}
			if(A[j]==max) {
				return j;
			}
			i++;j--;
		}
		return 0;
	}
	
	public int[] reverse(int[]A,int times)
    {
        for(int i=0;i<(times+1)/2;i++)
        {
            int temp=A[i];
            A[i]=A[times-i];
            A[times-i]=temp;
        }
        return A;
    }
	
	public static void main(String[] args) {
		System.out.println(new Solution().pancakeSort3(new int[] {30,20,40,50,10}));
	}
}