package org.Joyce.leetCode;

/**
 * @Author: XingDaoRong
 * @Date: 2022/1/12
 * 插入排序
 */
public class InsertSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i;j > 0 && arr[j-1] > arr[j] ;j--){
                Common.swap(arr,j,j-1);
            }
        }
        Common.lookArray("插入排序",arr);
    }
}
