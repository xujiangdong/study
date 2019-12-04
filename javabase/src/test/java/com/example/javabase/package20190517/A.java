package com.example.javabase.package20190517;

import org.assertj.core.internal.bytebuddy.asm.Advice.Enter;
import org.junit.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

/**
 * @author XuJD
 * @create 2019-05-17 14:55
 **/
public class A {

    @Test
    public void a(){
        int[] arr = {8,9,6,0,3,5,7,2,4,6};
        int[] temp = new int[10];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]] ++;
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<temp[i];j++){
                System.out.println(i);
            }
        }
    }

    @Test
    public void b(){
        String str = "qwertyuiopasdfghjklzxcvbnmaaaaqqqqwwwrrrrttt";
        int[] temp = new int[26];
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
            temp[str.charAt(i)]++;
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<temp[i];i++){
                System.out.println();
            }
        }
    }

    @Test
    public void c(){
        Map<String,Integer> map = new HashMap<>();
        map.put("a",3);
        map.put("b",2);
        map.put("c",5);
        Map<String,Integer> result = new LinkedHashMap<>();
        Stream<Entry<String,Integer>> st = map.entrySet().stream();
        st.sorted(Comparator.comparing(e->e.getValue())).forEach(e->result.put(e.getKey(),e.getValue()));
        System.out.println(result);

    }
}
