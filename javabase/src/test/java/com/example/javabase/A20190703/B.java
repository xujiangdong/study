package com.example.javabase.A20190703;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author XuJD
 * @create 2019-07-05 11:27
 **/
public class B {

    @Test
    public void a(){
        //System.out.println(romanToInt("MCDLXXVI"));
        String[] str = {"flower","flow","flowight"};
        String[] str1 = {"dog","racecar","car"};
        String[] str2 = {"ca","a"};
        System.out.println(longestCommonPrefix(str2));
    }

    public String longestCommonPrefix(String[] strs){
        String result="";
        if(strs.length==0){
            return result;
        }
        int minIndex=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<strs[minIndex].length()){
                minIndex = i;
            }
        }
        String minStr = strs[minIndex];
        for(int i=minStr.length();i>0;i--){
            String s = minStr.substring(0,i);
            boolean flag = true;
            for(int j=0;j<strs.length;j++){
                /*String s1 = strs[j].substring(0,i);
                if(!s.equals(s1)){
                    flag = false;
                }*/
                if(strs[j].indexOf(s)!=0){
                    flag = false;
                }
            }
            if(flag){
                result = s;
                break;
            }
        }
        return result;
    }

    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int ans = 0;
        for(int i = 0;i < s.length();) {
            int len = s.length();
            if(i + 1 < len && map.containsKey(s.substring(i, i+2))) {
                ans += map.get(s.substring(i, i+2));
                i += 2;
            } else {
                ans += map.get(s.substring(i, i+1));
                i ++;
            }
        }
        return ans;
    }

    public int getNum(String str){
        switch(str){
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                return 0;
        }
    }
}
