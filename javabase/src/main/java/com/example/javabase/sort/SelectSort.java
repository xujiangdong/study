package com.example.javabase.sort;

import com.example.javabase.util.PrintUtill;

/**
 * 选择排序
 * 1、在剩下的数种选择最小的放最左边
 * @author XuJD
 * @create 2019-12-03 15:16
 **/
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {5,8,4,2,6,1,3,7,9,0};
        int[] d = sortA(arr);
        PrintUtill.print(d);
    }

    public static int[] sortA(int[] data){
        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                int temp;
                if(data[i] > data[j]){
                    temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        return data;
    }
}
