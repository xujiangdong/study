package com.example.javabase.A20190703;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author XuJD
 * @create 2019-07-03 16:59
 **/
public class A {

    @Test
    public void a(){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoNum(nums,target);

        System.out.println(c(123321));
    }

    public boolean c(int x){
        int temp = x;
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
        int res=0;
        while(x!=0){
            int pop=x%10;
            res=res*10+pop;
            x/=10;
        }
        if(res==temp){
            return true;
        }
        return false;
    }

    @Test
    public void b(){
        int x = -64651238;
        //StringBuffer sb = new StringBuffer(Integer.toString(x));
        //System.out.println(sb.reverse());
       int res = 0;
       while (x!=0){
           int pop = x%10;
            if(res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE&&pop>7)){
                System.out.println(0);
            }
            if(res<Integer.MIN_VALUE || (res==Integer.MIN_VALUE/10&&pop<-8)){
                System.out.println(0);
            }
           res = res*10+pop;
           x/=10;
       }
        System.out.println(res);
    }

    public int[] twoNum(int[] nums,int target){
        /*int[] back = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    back[0] = i;
                    back[1] = j;
                    break;
                }
            }
        }
        return back;*/
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp = target-nums[i];
            if(map.containsKey(temp)){
                return new int[]{i,map.get(temp)};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
