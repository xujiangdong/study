package com.example.javabase.A201906;

import org.junit.Test;

/**
 * @author XuJD
 * @create 2019-06-14 16:01
 **/
public class A0614 {
    int[] arr = {8,5,6,2,3,4,7,1};

    @Test
    public void a(){//冒泡  缺点：数组如果有序还是会完整的循环比较一遍
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);
    }

    @Test
    public void b(){//冒泡 对于有序数组，只比较一遍
        int temp;
        boolean isSort = true;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSort = false;
                }
            }
            if(isSort){
                break;
            }
        }
        printArr(arr);
    }

    @Test
    public void c(){//选择
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }

    @Test
    public void d(){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                int temp;
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);
    }


    public void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
