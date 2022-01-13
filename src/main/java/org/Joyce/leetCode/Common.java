package org.Joyce.leetCode;

import java.util.Arrays;

/**
 * @Author: XingDaoRong
 * @Date: 2022/1/12
 */
public class Common {
    //数组
    static int[] arr = generateRandomArray(100,100);

    /**
     * 查看数组
     * @param arry
     */
   public static void lookArray(String name,int[] arry){
        returnNull(arry);
       System.out.println(name+":"+ Arrays.toString(arry));

   }

    /**
     * 数组非空判断
     * @param arr
     */
   public static void returnNull(int[] arr){
       if (null==arr||arr.length==0){
           return;
       }
   }





    /**
     * 数组交换
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //自己写一个数组生成器，测试方法
    public static int[] generateRandomArray(int maxSize,int maxValue){
        int[] arr = new int[(int)((maxSize + 1)*Math.random()+10)];   //长度随机
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((maxValue + 1)*Math.random());
        }
        lookArray("随机生成的数组",arr);
        return arr;
    }


}
