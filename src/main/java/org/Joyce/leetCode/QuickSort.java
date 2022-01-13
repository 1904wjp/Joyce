package org.Joyce.leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: XingDaoRong
 * @Date: 2022/1/12
 * 快排：
 *
 * 快排1.0：取最后一个数为基准，大于的数放他的右边，小于他的数放左边，左边和右边依次递归；
 * 快排2.0：取最后一个数为基准，等于它的数放中间，大于的数放他的右边，小于他的数放左边，左边和右边依次递归；
 * 快排3.0：随机取一个数为基准，等于它的数放中间，大于的数放他的右边，小于他的数放左边，左边和右边依次递归；
 */
public class QuickSort {

    public static void sort(int[] arr, int left, int right) {
        if (left<right){
            int index = partition(arr,left,right);
            sort(arr,left,index-1);
            sort(arr,index+1,right);
        }
        Common.lookArray("基础快排",arr);
    }

    public static int partition(int[] arr, int left, int right) {
       int key = arr[left];
       while (left<right){
           while (left<right && arr[right]>=key){
               right--;
           }
           //右边较小的值就会和开始以基准的值进行赋值，
           arr[left] = arr[right];
           while (left<right && arr[left]<=key){
               left++;
           }
           arr[right] = arr[left];
       }
        arr[left] = key;
        return left;
    }
}
