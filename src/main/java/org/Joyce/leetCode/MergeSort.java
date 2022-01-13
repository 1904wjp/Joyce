package org.Joyce.leetCode;

/**
 * @Author: XingDaoRong
 * @Date: 2022/1/13
 * 归并排序
 */
public class MergeSort {

    public static void sort(int[] arr, int left, int right) {
        int mid = left+((right-left)>>1);
        if (right>left){
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
        Common.lookArray("归并排序",arr);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        //长度待定
        int [] temp = new int[right-left+1];
        int i= left;
        int j = mid+1;
        int k = 0;
        //较小值移除新数组
        while (i<=mid && j<=right){
            if (arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else {
                temp[k++]=arr[j++];
            }
        }
        //左边剩余的加入新数组
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        //右边剩余的加入新数组
        while (j<=right){
            temp[k++]=arr[j++];
        }
        //数组归并到一起
        for (int i1 = 0; i1 < temp.length; i1++) {
            arr[i1+left]=temp[i1];
        }
    }
}
