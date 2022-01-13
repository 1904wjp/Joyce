package org.Joyce.leetCode;

/**
 * @Author: XingDaoRong
 * @Date: 2022/1/12
 * 选择排序
 */
public class SelectionSort {

    public  static void sort(int[] arr){
       Common.returnNull(arr);
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j=i+1;j<arr.length; j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            Common.swap(arr,i,minIndex);
        }
        Common.lookArray("选择排序",arr);
    }

}
