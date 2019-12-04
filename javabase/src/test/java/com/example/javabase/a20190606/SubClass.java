package com.example.javabase.a20190606;

/**
 * @author XuJD
 * @create 2019-06-06 15:06
 **/
public class SubClass extends SuperClass {
    static
    {
        System.out.println("SubClass init");
    }

    static int a;

    public SubClass()
    {
        System.out.println("init SubClass");
    }

    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
