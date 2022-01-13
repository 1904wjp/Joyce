package org.Joyce.leetCode;




/**
 * @Author: XingDaoRong
 * @Date: 2022/1/12
 * 冒泡排序
 */
public class BubbleSort {
   public static void sort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j=0;j < arr.length ;j++)
                    if (arr[i]>arr[j]){
                        Common.swap(arr,i,j);
                    }
            }
       Common.lookArray("冒泡排序",arr);
    }
}
