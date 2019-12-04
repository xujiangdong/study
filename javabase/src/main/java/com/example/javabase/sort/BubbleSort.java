package com.example.javabase.sort;

import com.example.javabase.util.PrintUtill;

/**
 * 冒泡排序
 * 1、比较相邻的两个数，小的放左边，大的放右边
 * @author XuJD
 * @create 2019-12-03 14:45
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5,8,4,2,6,1,3,7,9,0};
        //int[] d = sortA(arr);
        int[] d = sortB(arr);
        PrintUtill.print(d);
    }

    public static int[] sortA(int[] data){
        for(int i=0;i<data.length-1;i++){
            for(int j=0;j<data.length-i-1;j++){
                int temp;
                if(data[j]>data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        return data;
    }

    public static int[] sortB(int[] data){
        boolean flag = true;
        for(int i=0;i<data.length-1 && flag;i++){
            for(int j=0;j<data.length-i-1;j++){
                int temp;
                flag = false;
                if(data[j]>data[j+1]){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    flag = true;
                }
            }
        }
        return data;
    }
}
