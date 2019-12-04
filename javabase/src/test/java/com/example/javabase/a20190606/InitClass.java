package com.example.javabase.a20190606;

/**
 * @author XuJD
 * @create 2019-06-06 15:09
 **/
public class InitClass {
    static
    {
        System.out.println("InitClass init");
    }
    public static void main(String[] args) {

        System.out.println(SubClass.value);
    }
}
