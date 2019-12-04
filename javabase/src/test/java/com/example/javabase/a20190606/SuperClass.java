package com.example.javabase.a20190606;

/**
 * @author XuJD
 * @create 2019-06-06 15:06
 **/
public class SuperClass extends SSClass {
    static
    {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;

    public SuperClass()
    {
        System.out.println("init SuperClass");
    }
}
