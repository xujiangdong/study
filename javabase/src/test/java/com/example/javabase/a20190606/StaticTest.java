package com.example.javabase.a20190606;

/**
 * @author XuJD
 * @create 2019-06-06 15:16
 **/
public class StaticTest {

    public static void main(String[] args) {
        staticFunction();
    }
    static StaticTest st = new StaticTest();
    static
    {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    StaticTest()
    {
        System.out.println("3");
        System.out.println("a="+a+",b="+b);
    }
    public static void staticFunction(){
        System.out.println("4");
    }
    int a=110;
    static int b =112;
}
