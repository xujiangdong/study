package com.example.javabase.A201906;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author XuJD
 * @create 2019-06-11 17:20
 **/
public class A0611 {

    @Test
    public void a(){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put(null,null);
        System.out.println(hashMap.get(null));
        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("1","222");
        System.out.println(hashtable.get("1"));
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("1","3333");
        System.out.println(concurrentHashMap.size());
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(10);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

}
