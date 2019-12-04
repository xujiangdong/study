package com.example.javabase.ListTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.*;

/**
 * @author XuJD
 * @create 2019-04-01 18:24
 **/
public class SortTest {

    @Test
    public void a(){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(5);
        /*list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -1;
            }
        });*/
        /*Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -1;
            }
        });*/
        //Arrays.sort((Integer[])list);

        System.out.println(list);
    }
}
