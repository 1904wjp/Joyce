package org.Joyce.leetCode;


/**
 * @Author: XingDaoRong
 * @Date: 2022/1/12
 * 二分法求最大值
 */
public class Process {

    private static int sort(int[] arr, int left, int right) {
        if (left==right){
            return arr[left];
        }
        int mid = left+((right-left)>>1);
        int leftMax = sort(arr,left,mid);//N/2
        int rightMax = sort(arr,mid+1,right);//N/2
        return Math.max(leftMax,rightMax);//O(1)
        //T(N) = 2*T(N/2)+O(1)
    }


}
